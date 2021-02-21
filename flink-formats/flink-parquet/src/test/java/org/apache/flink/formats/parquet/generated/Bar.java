/**
 * Autogenerated by Avro
 *
 * <p>DO NOT EDIT DIRECTLY
 */
package org.apache.flink.formats.parquet.generated;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Bar extends org.apache.avro.specific.SpecificRecordBase
        implements org.apache.avro.specific.SpecificRecord {
    private static final long serialVersionUID = 1175980344330188560L;
    public static final org.apache.avro.Schema SCHEMA$ =
            new org.apache.avro.Schema.Parser()
                    .parse(
                            "{\"type\":\"record\",\"name\":\"Bar\",\"namespace\":\"org.apache.flink.formats.parquet.generated\",\"fields\":[{\"name\":\"spam\",\"type\":[\"null\",\"long\"],\"default\":null}]}");

    public static org.apache.avro.Schema getClassSchema() {
        return SCHEMA$;
    }

    private static SpecificData MODEL$ = new SpecificData();

    private static final BinaryMessageEncoder<Bar> ENCODER =
            new BinaryMessageEncoder<Bar>(MODEL$, SCHEMA$);

    private static final BinaryMessageDecoder<Bar> DECODER =
            new BinaryMessageDecoder<Bar>(MODEL$, SCHEMA$);

    /** Return the BinaryMessageDecoder instance used by this class. */
    public static BinaryMessageDecoder<Bar> getDecoder() {
        return DECODER;
    }

    /**
     * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link
     * SchemaStore}.
     *
     * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
     */
    public static BinaryMessageDecoder<Bar> createDecoder(SchemaStore resolver) {
        return new BinaryMessageDecoder<Bar>(MODEL$, SCHEMA$, resolver);
    }

    /** Serializes this Bar to a ByteBuffer. */
    public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
        return ENCODER.encode(this);
    }

    /** Deserializes a Bar from a ByteBuffer. */
    public static Bar fromByteBuffer(java.nio.ByteBuffer b) throws java.io.IOException {
        return DECODER.decode(b);
    }

    @Deprecated public java.lang.Long spam;

    /**
     * Default constructor. Note that this does not initialize fields to their default values from
     * the schema. If that is desired then one should use <code>newBuilder()</code>.
     */
    public Bar() {}

    /**
     * All-args constructor.
     *
     * @param spam The new value for spam
     */
    public Bar(java.lang.Long spam) {
        this.spam = spam;
    }

    public org.apache.avro.Schema getSchema() {
        return SCHEMA$;
    }
    // Used by DatumWriter.  Applications should not call.
    public java.lang.Object get(int field$) {
        switch (field$) {
            case 0:
                return spam;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    // Used by DatumReader.  Applications should not call.
    @SuppressWarnings(value = "unchecked")
    public void put(int field$, java.lang.Object value$) {
        switch (field$) {
            case 0:
                spam = (java.lang.Long) value$;
                break;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    /**
     * Gets the value of the 'spam' field.
     *
     * @return The value of the 'spam' field.
     */
    public java.lang.Long getSpam() {
        return spam;
    }

    /**
     * Sets the value of the 'spam' field.
     *
     * @param value the value to set.
     */
    public void setSpam(java.lang.Long value) {
        this.spam = value;
    }

    /**
     * Creates a new Bar RecordBuilder.
     *
     * @return A new Bar RecordBuilder
     */
    public static org.apache.flink.formats.parquet.generated.Bar.Builder newBuilder() {
        return new org.apache.flink.formats.parquet.generated.Bar.Builder();
    }

    /**
     * Creates a new Bar RecordBuilder by copying an existing Builder.
     *
     * @param other The existing builder to copy.
     * @return A new Bar RecordBuilder
     */
    public static org.apache.flink.formats.parquet.generated.Bar.Builder newBuilder(
            org.apache.flink.formats.parquet.generated.Bar.Builder other) {
        return new org.apache.flink.formats.parquet.generated.Bar.Builder(other);
    }

    /**
     * Creates a new Bar RecordBuilder by copying an existing Bar instance.
     *
     * @param other The existing instance to copy.
     * @return A new Bar RecordBuilder
     */
    public static org.apache.flink.formats.parquet.generated.Bar.Builder newBuilder(
            org.apache.flink.formats.parquet.generated.Bar other) {
        return new org.apache.flink.formats.parquet.generated.Bar.Builder(other);
    }

    /** RecordBuilder for Bar instances. */
    public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Bar>
            implements org.apache.avro.data.RecordBuilder<Bar> {

        private java.lang.Long spam;

        /** Creates a new Builder */
        private Builder() {
            super(SCHEMA$);
        }

        /**
         * Creates a Builder by copying an existing Builder.
         *
         * @param other The existing Builder to copy.
         */
        private Builder(org.apache.flink.formats.parquet.generated.Bar.Builder other) {
            super(other);
            if (isValidValue(fields()[0], other.spam)) {
                this.spam = data().deepCopy(fields()[0].schema(), other.spam);
                fieldSetFlags()[0] = true;
            }
        }

        /**
         * Creates a Builder by copying an existing Bar instance
         *
         * @param other The existing instance to copy.
         */
        private Builder(org.apache.flink.formats.parquet.generated.Bar other) {
            super(SCHEMA$);
            if (isValidValue(fields()[0], other.spam)) {
                this.spam = data().deepCopy(fields()[0].schema(), other.spam);
                fieldSetFlags()[0] = true;
            }
        }

        /**
         * Gets the value of the 'spam' field.
         *
         * @return The value.
         */
        public java.lang.Long getSpam() {
            return spam;
        }

        /**
         * Sets the value of the 'spam' field.
         *
         * @param value The value of 'spam'.
         * @return This builder.
         */
        public org.apache.flink.formats.parquet.generated.Bar.Builder setSpam(
                java.lang.Long value) {
            validate(fields()[0], value);
            this.spam = value;
            fieldSetFlags()[0] = true;
            return this;
        }

        /**
         * Checks whether the 'spam' field has been set.
         *
         * @return True if the 'spam' field has been set, false otherwise.
         */
        public boolean hasSpam() {
            return fieldSetFlags()[0];
        }

        /**
         * Clears the value of the 'spam' field.
         *
         * @return This builder.
         */
        public org.apache.flink.formats.parquet.generated.Bar.Builder clearSpam() {
            spam = null;
            fieldSetFlags()[0] = false;
            return this;
        }

        @Override
        @SuppressWarnings("unchecked")
        public Bar build() {
            try {
                Bar record = new Bar();
                record.spam =
                        fieldSetFlags()[0] ? this.spam : (java.lang.Long) defaultValue(fields()[0]);
                return record;
            } catch (java.lang.Exception e) {
                throw new org.apache.avro.AvroRuntimeException(e);
            }
        }
    }

    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumWriter<Bar> WRITER$ =
            (org.apache.avro.io.DatumWriter<Bar>) MODEL$.createDatumWriter(SCHEMA$);

    @Override
    public void writeExternal(java.io.ObjectOutput out) throws java.io.IOException {
        WRITER$.write(this, SpecificData.getEncoder(out));
    }

    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumReader<Bar> READER$ =
            (org.apache.avro.io.DatumReader<Bar>) MODEL$.createDatumReader(SCHEMA$);

    @Override
    public void readExternal(java.io.ObjectInput in) throws java.io.IOException {
        READER$.read(this, SpecificData.getDecoder(in));
    }
}
