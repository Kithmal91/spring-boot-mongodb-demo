package com.cookiecodelabs.repository;

import com.cookiecodelabs.model.Image;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Kithmal on 12/6/16.
 */
public interface UploadImageRepository extends MongoRepository<Image, String> {
}
