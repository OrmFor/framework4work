package com.jlkj.web.shopnew.service.impl;



import com.jlkj.web.shopnew.service.BrowseRecordService;
import com.jlkj.web.shopnew.pojo.BrowseRecord;
import com.jlkj.web.shopnew.request.UpdateCustomerRequest;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BrowseRecordServiceImpl implements BrowseRecordService {

    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public Map<String,Object> findList(String visited, Integer page , int rows) {
        Criteria criteria = new Criteria().andOperator(
                Criteria.where("visited").is(visited)
        );

        PageRequest pageRequest = PageRequest.of(page - 1, rows,
                Sort.by(Sort.Direction.ASC, "time"));

        // 设置查询条件，分页
        Query query = Query.query(criteria).with(pageRequest);
        Long count = mongoTemplate.count(query, BrowseRecord.class);//查询总记录数
        List<BrowseRecord> list = this.mongoTemplate.find(query, BrowseRecord.class);

        Map<String,Object> data = new HashMap<>();
        data.put("totalCount",count);
        data.put("list",list);
        return data;
    }

    @Override
    public BrowseRecord findBrowseRecordByVisitor(String visitor) {
        Criteria criteria = new Criteria().andOperator(
                Criteria.where("visited").is(visitor)
        );
        Query query = Query.query(criteria);
        query.fields().exclude("id");
        return this.mongoTemplate.findOne(query, BrowseRecord.class);

    }

    @Override
    public UpdateResult updateCustomer(UpdateCustomerRequest updateCustomerRequest) {
        Criteria criteria = new Criteria().andOperator(
                Criteria.where("visitorCode").is(updateCustomerRequest.getVisitorCode()),
                Criteria.where("visitedCode").is(updateCustomerRequest.getVisitedCode()));
        Query query = Query.query(criteria);
        BrowseRecord bean = this.mongoTemplate.findOne(query, BrowseRecord.class);

        if(bean != null){
            Update update = Update.update("type",updateCustomerRequest.getType());
            return this.mongoTemplate.updateMulti(query, update , BrowseRecord.class);
        }
        return null;
    }

    @Override
    public UpdateResult update(String visitor) {
        Criteria criteria = new Criteria().andOperator(
                Criteria.where("visitorCode").is(visitor));
        Query query = Query.query(criteria);
        BrowseRecord bean = this.mongoTemplate.findOne(query, BrowseRecord.class);

        Long num = bean.getNum();
        Update update = Update.update("num", num + 1);
        return  this.mongoTemplate.updateFirst(query, update, BrowseRecord.class);
    }

    @Override
    public void saveBrowseRecord(BrowseRecord browseRecord) {
        Criteria criteria = new Criteria().andOperator(
                Criteria.where("visitorCode").is(browseRecord.getVisitorCode()),
                Criteria.where("visitedCode").is(browseRecord.getVisitedCode()));
        Query query = Query.query(criteria);
        BrowseRecord bean = this.mongoTemplate.findOne(query, BrowseRecord.class);
        if (bean != null) {
            Long num = bean.getNum();
            Update update = Update.update("num", num + 1L);
            this.mongoTemplate.updateFirst(query, update, BrowseRecord.class);
        } else {
            browseRecord.setNum(1L);
            this.mongoTemplate.save(browseRecord);
        }
    }

    @Override
    public DeleteResult delete(String id) {
        Query query = Query.query(Criteria.where("_id").is(new ObjectId(id)));
        return this.mongoTemplate.remove(query,BrowseRecord.class);
    }

}
