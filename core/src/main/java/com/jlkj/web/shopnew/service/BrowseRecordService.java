package com.jlkj.web.shopnew.service;



import com.jlkj.web.shopnew.pojo.BrowseRecord;
import com.jlkj.web.shopnew.request.UpdateCustomerRequest;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;

import java.util.Map;

public interface BrowseRecordService {


    Map<String, Object> findList(String visited, Integer page, int rows);


    BrowseRecord findBrowseRecordByVisitor(String visitor);

    UpdateResult updateCustomer(UpdateCustomerRequest updateCustomerRequest);

    UpdateResult update(String visitor);


    void saveBrowseRecord(BrowseRecord browseRecord);


    DeleteResult delete(String id);

}
