package spring.user.dto;

public class Review {
	
	private int review_id;
	private int customer_id;
	private String review;
	public Review(int review_id, int customer_id, String review) {
		super();
		this.review_id = review_id;
		this.customer_id = customer_id;
		this.review = review;
	}

	public Review() {}

	public int getReview_id() {
		return review_id;
	}

	public void setReview_id(int review_id) {
		this.review_id = review_id;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	@Override
	public String toString() {
		return "review [review_id=" + review_id + ", customer_id=" + customer_id + ", review=" + review + "]";
	}
	
}
