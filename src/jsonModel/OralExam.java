package jsonModel;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OralExam implements Serializable {

	@SerializedName("no")
	@Expose
	private String no;
	@SerializedName("duration")
	@Expose
	private String duration;
	@SerializedName("total_workload")
	@Expose
	private String totalWorkload;
	private final static long serialVersionUID = 5552888064185394864L;

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getTotalWorkload() {
		return totalWorkload;
	}

	public void setTotalWorkload(String totalWorkload) {
		this.totalWorkload = totalWorkload;
	}

}