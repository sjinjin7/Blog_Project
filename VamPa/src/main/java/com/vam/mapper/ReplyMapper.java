package com.vam.mapper;

import java.util.List;

import com.vam.model.Criteria;
import com.vam.model.ReplyDTO;
import com.vam.model.UpdateReplyDTO;

public interface ReplyMapper {

	/* 댓글 등록 */
	public int enrollReply(ReplyDTO dto);	
	
	/* 댓글 존재 체크 */
	public Integer checkReply(ReplyDTO dto);	
	
	/* 댓글 페이징 */
	public List<ReplyDTO> getReplyList(Criteria cri);
	
	/* 댓글 총 갯수(페이징) */
	public int getReplyTotal(int bookId);	
	
	/* 댓글 수정 */
	public int updateReply(ReplyDTO dto);	
	
	/* 댓글 한개 정보(수정페이지) */
	public ReplyDTO getUpdateReply(int replyId);
	
	/* 댓글 삭제 */
	public int deleteReply(int replyId);	
	
	/* 평점 평균 구하기 */
	public Double getRatingAverage(int bookId);
	
	/* 평점 평균 반영하기 */
	public int updateRating(UpdateReplyDTO dto);	
	
}
