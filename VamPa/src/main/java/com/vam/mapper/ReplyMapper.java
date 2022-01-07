package com.vam.mapper;

import com.vam.model.ReplyDTO;

public interface ReplyMapper {

	/* 댓글 등록 */
	public int enrollReply(ReplyDTO dto);	
	
	/* 댓글 존재 체크 */
	public Integer checkReply(ReplyDTO dto);	
	
}
