package com.ybm.hotdog.board.parcel.dao;

import java.util.List;

import com.ybm.hotdog.board.domain.ArticleDTO;
import com.ybm.hotdog.board.domain.ReplyDTO;

public interface BoardParcelDAO {

	/** 게시글의 목록 조회 */
	public List<ArticleDTO> listAll(String searchOption, String keyword, int start, int end);// 모든 게시글을 가져옴으로 반환형이 리스트임을 알 수 있음.

	/** 검색 게시글 전체 수 */
	public int searchCount(String searchOption, String keyword);

	/** 댓글 전체 조회 */
	public List<ReplyDTO> listReply(int articleNo);

	/** 게시글의 상세 내용 조회 */
	public ArticleDTO getArticle(int articleNo);// 많은 게시글 중 articleNo에 해당하는 글 하나만 가져옴.

	/** 게시글 저장 */
	public void articleInsert(ArticleDTO articleDTO);

	/** 답글 구조 */
	public void replyView(int group, int order);

	/** 답글 저장 */
	public void articleReplyInsert(ArticleDTO articleDTO);

	/** 댓글 저장 */
	public void replyInsert(ReplyDTO replyDTO);

	/** 게시글 수정 */
	public void articleUpdate(ArticleDTO articleDTO);

	/** 게시글 삭제 */
	public void articleDelete(int articleNo);

	/** 게시글 조회수 증가 */
	public void increaseHitCount(int articleNo);

}
