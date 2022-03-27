package com.manish.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
@Configuration
public class DynamodbConfig {
	
	@Bean
	public DynamoDBMapper mapper() {
		
		return new DynamoDBMapper(amazonDynamoDBConfig());
	}
	@Bean
	public AmazonDynamoDB amazonDynamoDBConfig() {
		// TODO Auto-generated method stub
		return AmazonDynamoDBClientBuilder.standard()
				.withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration("dynamodb.us-east-1.amazonaws.com", "us-east-1"))
				.withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials("AKIAY5E6NNXUGDDAKEWA", "5F4ZVEAIpeGegXiLZLrf4gVTzJFE7+LxLkdwrxWT")))
				.build();
						
	}

}
