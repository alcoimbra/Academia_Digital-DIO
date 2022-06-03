package br.com.academia.infra.jackson.deser;

import java.io.IOException;
import java.time.LocalDateTime;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import br.com.academia.infra.utils.JavaTimeUtils;

public class LocalDateTimeDeserializer extends StdDeserializer<LocalDateTime>{

	private static final long serialVersionUID = 2273681285913833904L;
	
	public LocalDateTimeDeserializer() {
		super(LocalDateTime.class);
	}
	
	@Override
	public LocalDateTime deserialize(final JsonParser parser, final DeserializationContext context) throws IOException {
		return LocalDateTime.parse(parser.readValueAs(String.class), JavaTimeUtils.LOCAL_DATE_TIME_FORMATTER);
	}
}