package com.jeremiahseagraves.designpatterns.structural.bridge.advanced.formattable;

import com.jeremiahseagraves.designpatterns.structural.bridge.advanced.domain.Detail;

import java.util.List;

public class SimpleStringFormattableImpl implements Formattable {

	@Override
	public String format(String header, List<Detail> details) {
		StringBuilder builder = new StringBuilder();
		builder.append(header);
		builder.append("\n");

		for (Detail detail : details) {
			builder.append(detail.getLabel());
			builder.append(":");
			builder.append(detail.getValue());
			builder.append("\n");
		}

		return builder.toString();
	}
}