package com.example.dao;


	 import javax.persistence.Entity;
		import javax.persistence.Id;
		import javax.persistence.Table;
		@Entity
		@Table(name="Customer")
		public class Customer1 {
			@Id
			private int cid;
			private String cname;
		   private	String cemail;
		public Customer1() {
			
		}
		public Customer1(int cid, String cname, String cemail) {
			super();
			this.cid = cid;
			this.cname = cname;
			this.cemail = cemail;
		}
		public int getCid() {
			return cid;
		}
		public void  setCid(int cid) {
			this.cid = cid;
		}
		public String getCname() {
			return cname;
		}
		public void setCname(String cname  ) {
			this.cname = cname;
		}
		public String getCemail() {
			return cemail;
		}
		public void setCemail(String cemail) {
			this.cemail = cemail;
		}
		@Override
		public String toString() {
			return "Customer [cid=" + cid + ", cname=" + cname + ", cemail=" + cemail + "]";
		}

		}





