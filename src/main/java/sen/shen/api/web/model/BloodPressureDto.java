package sen.shen.api.web.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BloodPressureDto {
	
	// 	收縮壓 (大的那個)
	private Integer systolic;
	
	// 舒張壓 (小的那個)
	private Integer diastolic;
	
	// 心跳
	private Integer heartbeat;

	// 建立日期
	private Date createDate;
	
	// 建立時間點
	private DayEnum createTodayEnum;
}
