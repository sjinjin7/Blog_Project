package com.vam.model;

import java.util.List;

public class ReplyPageDTO {

	List<ReplyDTO> list;
	
	PageDTO pageInfo;

	public List<ReplyDTO> getList() {
		return list;
	}

	public void setList(List<ReplyDTO> list) {
		this.list = list;
	}

	public PageDTO getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageDTO pageInfo) {
		this.pageInfo = pageInfo;
	}

	@Override
	public String toString() {
		return "ReplyPageDTO [list=" + list + ", pageInfo=" + pageInfo + "]";
	}
	
}
