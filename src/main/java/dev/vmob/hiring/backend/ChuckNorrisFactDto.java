package dev.vmob.hiring.backend;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChuckNorrisFactDto {
	private String fact;
}
