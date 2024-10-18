package com.office.services;

import java.util.List;

import com.office.formbinders.DashboardResponse;
import com.office.formbinders.EnquiryForm;
import com.office.formbinders.EnquirySearchCriteria;

public interface EnquiryService {
	public List<String> getCourseNames();
	public List<String> getEnqStatus();
	public DashboardResponse getDashboardData(Integer userId);
	public String upsertEnquiry(EnquiryForm enq);
	public List<EnquiryForm> getEnquries(Integer userid, 
			EnquirySearchCriteria criteria);

}
