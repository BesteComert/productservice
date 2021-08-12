package com.besteco.productservice.repository;

import com.besteco.productservice.entity.Product;
import com.couchbase.client.java.query.QueryScanConsistency;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.couchbase.repository.ScanConsistency;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends CouchbaseRepository<Product, Long> {

   @ScanConsistency(query = QueryScanConsistency.REQUEST_PLUS)
   Product findByName(String name);
}
