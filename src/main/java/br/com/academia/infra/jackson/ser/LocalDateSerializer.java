package br.com.academia.infra.jackson.ser;

import java.io.IOException;
import java.time.LocalDate;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import br.com.academia.infra.utils.JavaTimeUtils;

public class LocalDateSerializer extends StdSerializer<LocalDate>{

	private static final long serialVersionUID = -4752511539867907246L;
	
	public LocalDateSerializer() {
		super(LocalDate.class);
	}
	
	@Override
	public void serialize(final LocalDate value, final JsonGenerator generator, final SerializerProvider provider) throws IOException {
		generator.writeString(value.format(JavaTimeUtils.LOCAL_DATE_FORMATTER));
	}
}