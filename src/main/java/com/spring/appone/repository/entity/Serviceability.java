package com.spring.appone.repository.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Serviceability {
	
	    @Id
	    int id;
		int pincodes;
		int pid;
		int estimateddays;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getPincodes() {
			return pincodes;
		}
		public void setPincodes(int pincodes) {
			this.pincodes = pincodes;
		}
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public int getEstimateddays() {
			return estimateddays;
		}
		public void setEstimateddays(int estimateddays) {
			this.estimateddays = estimateddays;
		}
		@Override
		public String toString() {
			return "Serviceability [id=" + id + ", pincodes=" + pincodes + ", pid=" + pid + ", estimateddays="
					+ estimateddays + "]";
		}
	
}
