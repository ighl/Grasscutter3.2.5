// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.Internal;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class PropValueOuterClass
{
    private static final Descriptors.Descriptor internal_static_PropValue_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PropValue_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PropValueOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PropValueOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u000fPropValue.proto\"O\n\tPropValue\u0012\f\n\u0004type\u0018\u0001 \u0001(\r\u0012\u000b\n\u0003val\u0018\u0004 \u0001(\u0003\u0012\u000e\n\u0004ival\u0018\u0002 \u0001(\u0003H\u0000\u0012\u000e\n\u0004fval\u0018\u0003 \u0001(\u0002H\u0000B\u0007\n\u0005valueB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PropValueOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_PropValue_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PropValue_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PropValueOuterClass.internal_static_PropValue_descriptor, new String[] { "Type", "Val", "Ival", "Fval", "Value" });
    }
    
    public static final class PropValue extends GeneratedMessageV3 implements PropValueOrBuilder
    {
        private static final long serialVersionUID = 0L;
        private int valueCase_;
        private Object value_;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int type_;
        public static final int VAL_FIELD_NUMBER = 4;
        private long val_;
        public static final int IVAL_FIELD_NUMBER = 2;
        public static final int FVAL_FIELD_NUMBER = 3;
        private byte memoizedIsInitialized;
        private static final PropValue DEFAULT_INSTANCE;
        private static final Parser<PropValue> PARSER;
        
        private PropValue(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.valueCase_ = 0;
            this.memoizedIsInitialized = -1;
        }
        
        private PropValue() {
            this.valueCase_ = 0;
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PropValue();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PropValue(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            final UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    final int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue;
                        }
                        case 8: {
                            this.type_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.valueCase_ = 2;
                            this.value_ = input.readInt64();
                            continue;
                        }
                        case 29: {
                            this.valueCase_ = 3;
                            this.value_ = input.readFloat();
                            continue;
                        }
                        case 32: {
                            this.val_ = input.readInt64();
                            continue;
                        }
                        default: {
                            if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                                continue;
                            }
                            continue;
                        }
                    }
                }
            }
            catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            }
            catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
            }
            finally {
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return PropValueOuterClass.internal_static_PropValue_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PropValueOuterClass.internal_static_PropValue_fieldAccessorTable.ensureFieldAccessorsInitialized(PropValue.class, Builder.class);
        }
        
        @Override
        public ValueCase getValueCase() {
            return ValueCase.forNumber(this.valueCase_);
        }
        
        @Override
        public int getType() {
            return this.type_;
        }
        
        @Override
        public long getVal() {
            return this.val_;
        }
        
        @Override
        public boolean hasIval() {
            return this.valueCase_ == 2;
        }
        
        @Override
        public long getIval() {
            if (this.valueCase_ == 2) {
                return (long)this.value_;
            }
            return 0L;
        }
        
        @Override
        public boolean hasFval() {
            return this.valueCase_ == 3;
        }
        
        @Override
        public float getFval() {
            if (this.valueCase_ == 3) {
                return (float)this.value_;
            }
            return 0.0f;
        }
        
        @Override
        public final boolean isInitialized() {
            final byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
        
        @Override
        public void writeTo(final CodedOutputStream output) throws IOException {
            if (this.type_ != 0) {
                output.writeUInt32(1, this.type_);
            }
            if (this.valueCase_ == 2) {
                output.writeInt64(2, (long)this.value_);
            }
            if (this.valueCase_ == 3) {
                output.writeFloat(3, (float)this.value_);
            }
            if (this.val_ != 0L) {
                output.writeInt64(4, this.val_);
            }
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.type_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.type_);
            }
            if (this.valueCase_ == 2) {
                size += CodedOutputStream.computeInt64Size(2, (long)this.value_);
            }
            if (this.valueCase_ == 3) {
                size += CodedOutputStream.computeFloatSize(3, (float)this.value_);
            }
            if (this.val_ != 0L) {
                size += CodedOutputStream.computeInt64Size(4, this.val_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PropValue)) {
                return super.equals(obj);
            }
            final PropValue other = (PropValue)obj;
            if (this.getType() != other.getType()) {
                return false;
            }
            if (this.getVal() != other.getVal()) {
                return false;
            }
            if (!this.getValueCase().equals(other.getValueCase())) {
                return false;
            }
            switch (this.valueCase_) {
                case 2: {
                    if (this.getIval() != other.getIval()) {
                        return false;
                    }
                    break;
                }
                case 3: {
                    if (Float.floatToIntBits(this.getFval()) != Float.floatToIntBits(other.getFval())) {
                        return false;
                    }
                    break;
                }
            }
            return this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getType();
            hash = 37 * hash + 4;
            hash = 53 * hash + Internal.hashLong(this.getVal());
            switch (this.valueCase_) {
                case 2: {
                    hash = 37 * hash + 2;
                    hash = 53 * hash + Internal.hashLong(this.getIval());
                    break;
                }
                case 3: {
                    hash = 37 * hash + 3;
                    hash = 53 * hash + Float.floatToIntBits(this.getFval());
                    break;
                }
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PropValue parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PropValue.PARSER.parseFrom(data);
        }
        
        public static PropValue parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PropValue.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PropValue parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PropValue.PARSER.parseFrom(data);
        }
        
        public static PropValue parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PropValue.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PropValue parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PropValue.PARSER.parseFrom(data);
        }
        
        public static PropValue parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PropValue.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PropValue parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PropValue.PARSER, input);
        }
        
        public static PropValue parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PropValue.PARSER, input, extensionRegistry);
        }
        
        public static PropValue parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PropValue.PARSER, input);
        }
        
        public static PropValue parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PropValue.PARSER, input, extensionRegistry);
        }
        
        public static PropValue parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PropValue.PARSER, input);
        }
        
        public static PropValue parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PropValue.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PropValue.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PropValue prototype) {
            return PropValue.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PropValue.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PropValue getDefaultInstance() {
            return PropValue.DEFAULT_INSTANCE;
        }
        
        public static Parser<PropValue> parser() {
            return PropValue.PARSER;
        }
        
        @Override
        public Parser<PropValue> getParserForType() {
            return PropValue.PARSER;
        }
        
        @Override
        public PropValue getDefaultInstanceForType() {
            return PropValue.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PropValue();
            PARSER = new AbstractParser<PropValue>() {
                @Override
                public PropValue parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PropValue(input, extensionRegistry);
                }
            };
        }
        
        public enum ValueCase implements Internal.EnumLite, InternalOneOfEnum
        {
            IVAL(2), 
            FVAL(3), 
            VALUE_NOT_SET(0);
            
            private final int value;
            
            private ValueCase(final int value) {
                this.value = value;
            }
            
            @Deprecated
            public static ValueCase valueOf(final int value) {
                return forNumber(value);
            }
            
            public static ValueCase forNumber(final int value) {
                switch (value) {
                    case 2: {
                        return ValueCase.IVAL;
                    }
                    case 3: {
                        return ValueCase.FVAL;
                    }
                    case 0: {
                        return ValueCase.VALUE_NOT_SET;
                    }
                    default: {
                        return null;
                    }
                }
            }
            
            @Override
            public int getNumber() {
                return this.value;
            }
            
            private static /* synthetic */ ValueCase[] value() {
                return new ValueCase[] { ValueCase.IVAL, ValueCase.FVAL, ValueCase.VALUE_NOT_SET };
            }
            
            
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PropValueOrBuilder
        {
            private int valueCase_;
            private Object value_;
            private int type_;
            private long val_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PropValueOuterClass.internal_static_PropValue_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PropValueOuterClass.internal_static_PropValue_fieldAccessorTable.ensureFieldAccessorsInitialized(PropValue.class, Builder.class);
            }
            
            private Builder() {
                this.valueCase_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.valueCase_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PropValue.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.type_ = 0;
                this.val_ = 0L;
                this.valueCase_ = 0;
                this.value_ = null;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PropValueOuterClass.internal_static_PropValue_descriptor;
            }
            
            @Override
            public PropValue getDefaultInstanceForType() {
                return PropValue.getDefaultInstance();
            }
            
            @Override
            public PropValue build() {
                final PropValue result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PropValue buildPartial() {
                final PropValue result = new PropValue(this);
                result.type_ = this.type_;
                result.val_ = this.val_;
                if (this.valueCase_ == 2) {
                    result.value_ = this.value_;
                }
                if (this.valueCase_ == 3) {
                    result.value_ = this.value_;
                }
                result.valueCase_ = this.valueCase_;
                this.onBuilt();
                return result;
            }
            
            @Override
            public Builder clone() {
                return super.clone();
            }
            
            @Override
            public Builder setField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.setField(field, value);
            }
            
            @Override
            public Builder clearField(final Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            
            @Override
            public Builder clearOneof(final Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            
            @Override
            public Builder setRepeatedField(final Descriptors.FieldDescriptor field, final int index, final Object value) {
                return super.setRepeatedField(field, index, value);
            }
            
            @Override
            public Builder addRepeatedField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.addRepeatedField(field, value);
            }
            
            @Override
            public Builder mergeFrom(final Message other) {
                if (other instanceof PropValue) {
                    return this.mergeFrom((PropValue)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PropValue other) {
                if (other == PropValue.getDefaultInstance()) {
                    return this;
                }
                if (other.getType() != 0) {
                    this.setType(other.getType());
                }
                if (other.getVal() != 0L) {
                    this.setVal(other.getVal());
                }
                switch (other.getValueCase()) {
                    case IVAL: {
                        this.setIval(other.getIval());
                        break;
                    }
                    case FVAL: {
                        this.setFval(other.getFval());
                        break;
                    }
                }
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }
            
            @Override
            public final boolean isInitialized() {
                return true;
            }
            
            @Override
            public Builder mergeFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                PropValue parsedMessage = null;
                try {
                    parsedMessage = PropValue.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PropValue)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            @Override
            public ValueCase getValueCase() {
                return ValueCase.forNumber(this.valueCase_);
            }
            
            public Builder clearValue() {
                this.valueCase_ = 0;
                this.value_ = null;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getType() {
                return this.type_;
            }
            
            public Builder setType(final int value) {
                this.type_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearType() {
                this.type_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public long getVal() {
                return this.val_;
            }
            
            public Builder setVal(final long value) {
                this.val_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearVal() {
                this.val_ = 0L;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasIval() {
                return this.valueCase_ == 2;
            }
            
            @Override
            public long getIval() {
                if (this.valueCase_ == 2) {
                    return (long)this.value_;
                }
                return 0L;
            }
            
            public Builder setIval(final long value) {
                this.valueCase_ = 2;
                this.value_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIval() {
                if (this.valueCase_ == 2) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                    this.onChanged();
                }
                return this;
            }
            
            @Override
            public boolean hasFval() {
                return this.valueCase_ == 3;
            }
            
            @Override
            public float getFval() {
                if (this.valueCase_ == 3) {
                    return (float)this.value_;
                }
                return 0.0f;
            }
            
            public Builder setFval(final float value) {
                this.valueCase_ = 3;
                this.value_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearFval() {
                if (this.valueCase_ == 3) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                    this.onChanged();
                }
                return this;
            }
            
            @Override
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface PropValueOrBuilder extends MessageOrBuilder
    {
        int getType();
        
        long getVal();
        
        boolean hasIval();
        
        long getIval();
        
        boolean hasFval();
        
        float getFval();
        
        PropValue.ValueCase getValueCase();
    }
}
