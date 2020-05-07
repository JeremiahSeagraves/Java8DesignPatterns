package com.jeremiahseagraves.designpatterns.structural.bridge.advanced.formattable;

import com.jeremiahseagraves.designpatterns.structural.bridge.advanced.domain.Detail;

import java.util.List;

public class HtmlFormattableImpl implements Formattable {

	@Override
	public String format(String header, List<Detail> details) {
		StringBuilder builder = new StringBuilder();
		builder.append("<table>");
		builder.append("<th>");
		builder.append("Classification");
		builder.append("</th>");
		builder.append("<th>");
		builder.append(header);
		builder.append("</th>");

		for (Detail detail : details) {
			builder.append("<tr><td>");
			builder.append(detail.getLabel());
			builder.append("</td><td>");
			builder.append(detail.getValue());
			builder.append("</td></tr>");
		}
		builder.append("</table>");

		return builder.toString();
	}

}
