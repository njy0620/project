package test;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import spring.user.dto.Review;

import spring.user.mapper.ReviewMapper;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/config/springContext.xml")
public class te1 {

	
	
	
	@Autowired
	private ReviewMapper reviewMapper;
	
	@Autowired
	private Review review;
	

	

		
	
	@Test
	public void testreview() {
		review.setReview_id(2);
		review.setCustomer_id(433);
		review.setReview("´¤´Ù¾ÆµÍ");
		
		
		
	}
	
	
	
}
