package com.congbang.domain;
// Generated Apr 14, 2018 9:37:20 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TakersolutionComponent generated by hbm2java
 */
@Entity
@Table(name = "takersolution_component", catalog = "testts")
public class TakersolutionComponent implements java.io.Serializable {

	private Integer takersolutionComponentId;
	private QuestionItem questionItemByCurrItemId;
	private QuestionItem questionItemByNextItemId;
	private TakerSolution takerSolution;
	private String fillValue;

	public TakersolutionComponent() {
	}

	public TakersolutionComponent(QuestionItem questionItemByCurrItemId, QuestionItem questionItemByNextItemId,
			TakerSolution takerSolution, String fillValue) {
		this.questionItemByCurrItemId = questionItemByCurrItemId;
		this.questionItemByNextItemId = questionItemByNextItemId;
		this.takerSolution = takerSolution;
		this.fillValue = fillValue;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "takersolution_component_id", unique = true, nullable = false)
	public Integer getTakersolutionComponentId() {
		return this.takersolutionComponentId;
	}

	public void setTakersolutionComponentId(Integer takersolutionComponentId) {
		this.takersolutionComponentId = takersolutionComponentId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "curr_item_id")
	public QuestionItem getQuestionItemByCurrItemId() {
		return this.questionItemByCurrItemId;
	}

	public void setQuestionItemByCurrItemId(QuestionItem questionItemByCurrItemId) {
		this.questionItemByCurrItemId = questionItemByCurrItemId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "next_item_id")
	public QuestionItem getQuestionItemByNextItemId() {
		return this.questionItemByNextItemId;
	}

	public void setQuestionItemByNextItemId(QuestionItem questionItemByNextItemId) {
		this.questionItemByNextItemId = questionItemByNextItemId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "taker_solution_id")
	public TakerSolution getTakerSolution() {
		return this.takerSolution;
	}

	public void setTakerSolution(TakerSolution takerSolution) {
		this.takerSolution = takerSolution;
	}

	@Column(name = "fill_value", length = 65535)
	public String getFillValue() {
		return this.fillValue;
	}

	public void setFillValue(String fillValue) {
		this.fillValue = fillValue;
	}

}