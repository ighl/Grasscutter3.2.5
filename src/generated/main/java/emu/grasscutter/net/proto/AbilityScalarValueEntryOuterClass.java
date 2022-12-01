// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.Internal;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Message;
import java.io.InputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ByteString;
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

public final class AbilityScalarValueEntryOuterClass
{
    private static final Descriptors.Descriptor internal_static_AbilityScalarValueEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AbilityScalarValueEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AbilityScalarValueEntryOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AbilityScalarValueEntryOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001dAbilityScalarValueEntry.proto\u001a\u0017AbilityScalarType.proto\u001a\u0013AbilityString.proto\"\u00c1\u0001\n\u0017AbilityScalarValueEntry\u0012\u001b\n\u0003key\u0018\u0001 \u0001(\u000b2\u000e.AbilityString\u0012&\n\nvalue_type\u0018\u0002 \u0001(\u000e2\u0012.AbilityScalarType\u0012\u0015\n\u000bfloat_value\u0018\u0003 \u0001(\u0002H\u0000\u0012\u0016\n\fstring_value\u0018\u0004 \u0001(\tH\u0000\u0012\u0013\n\tint_value\u0018\u0005 \u0001(\u0005H\u0000\u0012\u0014\n\nuint_value\u0018\u0006 \u0001(\rH\u0000B\u0007\n\u0005valueB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AbilityScalarValueEntryOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AbilityScalarTypeOuterClass.getDescriptor(), AbilityStringOuterClass.getDescriptor() });
        internal_static_AbilityScalarValueEntry_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AbilityScalarValueEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AbilityScalarValueEntryOuterClass.internal_static_AbilityScalarValueEntry_descriptor, new String[] { "Key", "ValueType", "FloatValue", "StringValue", "IntValue", "UintValue", "Value" });
        AbilityScalarTypeOuterClass.getDescriptor();
        AbilityStringOuterClass.getDescriptor();
    }
    
    public static final class AbilityScalarValueEntry extends GeneratedMessageV3 implements AbilityScalarValueEntryOrBuilder
    {
        private static final long serialVersionUID = 0L;
        private int valueCase_;
        private Object value_;
        public static final int KEY_FIELD_NUMBER = 1;
        private AbilityStringOuterClass.AbilityString key_;
        public static final int VALUE_TYPE_FIELD_NUMBER = 2;
        private int valueType_;
        public static final int FLOAT_VALUE_FIELD_NUMBER = 3;
        public static final int STRING_VALUE_FIELD_NUMBER = 4;
        public static final int INT_VALUE_FIELD_NUMBER = 5;
        public static final int UINT_VALUE_FIELD_NUMBER = 6;
        private byte memoizedIsInitialized;
        private static final AbilityScalarValueEntry DEFAULT_INSTANCE;
        private static final Parser<AbilityScalarValueEntry> PARSER;
        
        private AbilityScalarValueEntry(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.valueCase_ = 0;
            this.memoizedIsInitialized = -1;
        }
        
        private AbilityScalarValueEntry() {
            this.valueCase_ = 0;
            this.memoizedIsInitialized = -1;
            this.valueType_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AbilityScalarValueEntry();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AbilityScalarValueEntry(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 10: {
                            AbilityStringOuterClass.AbilityString.Builder subBuilder = null;
                            if (this.key_ != null) {
                                subBuilder = this.key_.toBuilder();
                            }
                            this.key_ = input.readMessage(AbilityStringOuterClass.AbilityString.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.key_);
                                this.key_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 16: {
                            final int rawValue = input.readEnum();
                            this.valueType_ = rawValue;
                            continue;
                        }
                        case 29: {
                            this.valueCase_ = 3;
                            this.value_ = input.readFloat();
                            continue;
                        }
                        case 34: {
                            final String s = input.readStringRequireUtf8();
                            this.valueCase_ = 4;
                            this.value_ = s;
                            continue;
                        }
                        case 40: {
                            this.valueCase_ = 5;
                            this.value_ = input.readInt32();
                            continue;
                        }
                        case 48: {
                            this.valueCase_ = 6;
                            this.value_ = input.readUInt32();
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
            return AbilityScalarValueEntryOuterClass.internal_static_AbilityScalarValueEntry_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AbilityScalarValueEntryOuterClass.internal_static_AbilityScalarValueEntry_fieldAccessorTable.ensureFieldAccessorsInitialized(AbilityScalarValueEntry.class, Builder.class);
        }
        
        @Override
        public ValueCase getValueCase() {
            return ValueCase.forNumber(this.valueCase_);
        }
        
        @Override
        public boolean hasKey() {
            return this.key_ != null;
        }
        
        @Override
        public AbilityStringOuterClass.AbilityString getKey() {
            return (this.key_ == null) ? AbilityStringOuterClass.AbilityString.getDefaultInstance() : this.key_;
        }
        
        @Override
        public AbilityStringOuterClass.AbilityStringOrBuilder getKeyOrBuilder() {
            return this.getKey();
        }
        
        @Override
        public int getValueTypeValue() {
            return this.valueType_;
        }
        
        @Override
        public AbilityScalarTypeOuterClass.AbilityScalarType getValueType() {
            final AbilityScalarTypeOuterClass.AbilityScalarType result = AbilityScalarTypeOuterClass.AbilityScalarType.valueOf(this.valueType_);
            return (result == null) ? AbilityScalarTypeOuterClass.AbilityScalarType.UNRECOGNIZED : result;
        }
        
        @Override
        public boolean hasFloatValue() {
            return this.valueCase_ == 3;
        }
        
        @Override
        public float getFloatValue() {
            if (this.valueCase_ == 3) {
                return (float)this.value_;
            }
            return 0.0f;
        }
        
        @Override
        public boolean hasStringValue() {
            return this.valueCase_ == 4;
        }
        
        @Override
        public String getStringValue() {
            Object ref = "";
            if (this.valueCase_ == 4) {
                ref = this.value_;
            }
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            if (this.valueCase_ == 4) {
                this.value_ = s;
            }
            return s;
        }
        
        @Override
        public ByteString getStringValueBytes() {
            Object ref = "";
            if (this.valueCase_ == 4) {
                ref = this.value_;
            }
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                if (this.valueCase_ == 4) {
                    this.value_ = b;
                }
                return b;
            }
            return (ByteString)ref;
        }
        
        @Override
        public boolean hasIntValue() {
            return this.valueCase_ == 5;
        }
        
        @Override
        public int getIntValue() {
            if (this.valueCase_ == 5) {
                return (int)this.value_;
            }
            return 0;
        }
        
        @Override
        public boolean hasUintValue() {
            return this.valueCase_ == 6;
        }
        
        @Override
        public int getUintValue() {
            if (this.valueCase_ == 6) {
                return (int)this.value_;
            }
            return 0;
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
            if (this.key_ != null) {
                output.writeMessage(1, this.getKey());
            }
            if (this.valueType_ != AbilityScalarTypeOuterClass.AbilityScalarType.ABILITY_SCALAR_TYPE_UNKNOW.getNumber()) {
                output.writeEnum(2, this.valueType_);
            }
            if (this.valueCase_ == 3) {
                output.writeFloat(3, (float)this.value_);
            }
            if (this.valueCase_ == 4) {
                GeneratedMessageV3.writeString(output, 4, this.value_);
            }
            if (this.valueCase_ == 5) {
                output.writeInt32(5, (int)this.value_);
            }
            if (this.valueCase_ == 6) {
                output.writeUInt32(6, (int)this.value_);
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
            if (this.key_ != null) {
                size += CodedOutputStream.computeMessageSize(1, this.getKey());
            }
            if (this.valueType_ != AbilityScalarTypeOuterClass.AbilityScalarType.ABILITY_SCALAR_TYPE_UNKNOW.getNumber()) {
                size += CodedOutputStream.computeEnumSize(2, this.valueType_);
            }
            if (this.valueCase_ == 3) {
                size += CodedOutputStream.computeFloatSize(3, (float)this.value_);
            }
            if (this.valueCase_ == 4) {
                size += GeneratedMessageV3.computeStringSize(4, this.value_);
            }
            if (this.valueCase_ == 5) {
                size += CodedOutputStream.computeInt32Size(5, (int)this.value_);
            }
            if (this.valueCase_ == 6) {
                size += CodedOutputStream.computeUInt32Size(6, (int)this.value_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbilityScalarValueEntry)) {
                return super.equals(obj);
            }
            final AbilityScalarValueEntry other = (AbilityScalarValueEntry)obj;
            if (this.hasKey() != other.hasKey()) {
                return false;
            }
            if (this.hasKey() && !this.getKey().equals(other.getKey())) {
                return false;
            }
            if (this.valueType_ != other.valueType_) {
                return false;
            }
            if (!this.getValueCase().equals(other.getValueCase())) {
                return false;
            }
            switch (this.valueCase_) {
                case 3: {
                    if (Float.floatToIntBits(this.getFloatValue()) != Float.floatToIntBits(other.getFloatValue())) {
                        return false;
                    }
                    break;
                }
                case 4: {
                    if (!this.getStringValue().equals(other.getStringValue())) {
                        return false;
                    }
                    break;
                }
                case 5: {
                    if (this.getIntValue() != other.getIntValue()) {
                        return false;
                    }
                    break;
                }
                case 6: {
                    if (this.getUintValue() != other.getUintValue()) {
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
            if (this.hasKey()) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getKey().hashCode();
            }
            hash = 37 * hash + 2;
            hash = 53 * hash + this.valueType_;
            switch (this.valueCase_) {
                case 3: {
                    hash = 37 * hash + 3;
                    hash = 53 * hash + Float.floatToIntBits(this.getFloatValue());
                    break;
                }
                case 4: {
                    hash = 37 * hash + 4;
                    hash = 53 * hash + this.getStringValue().hashCode();
                    break;
                }
                case 5: {
                    hash = 37 * hash + 5;
                    hash = 53 * hash + this.getIntValue();
                    break;
                }
                case 6: {
                    hash = 37 * hash + 6;
                    hash = 53 * hash + this.getUintValue();
                    break;
                }
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AbilityScalarValueEntry parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AbilityScalarValueEntry.PARSER.parseFrom(data);
        }
        
        public static AbilityScalarValueEntry parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityScalarValueEntry.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityScalarValueEntry parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AbilityScalarValueEntry.PARSER.parseFrom(data);
        }
        
        public static AbilityScalarValueEntry parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityScalarValueEntry.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityScalarValueEntry parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AbilityScalarValueEntry.PARSER.parseFrom(data);
        }
        
        public static AbilityScalarValueEntry parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityScalarValueEntry.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityScalarValueEntry parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityScalarValueEntry.PARSER, input);
        }
        
        public static AbilityScalarValueEntry parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityScalarValueEntry.PARSER, input, extensionRegistry);
        }
        
        public static AbilityScalarValueEntry parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AbilityScalarValueEntry.PARSER, input);
        }
        
        public static AbilityScalarValueEntry parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AbilityScalarValueEntry.PARSER, input, extensionRegistry);
        }
        
        public static AbilityScalarValueEntry parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityScalarValueEntry.PARSER, input);
        }
        
        public static AbilityScalarValueEntry parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityScalarValueEntry.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AbilityScalarValueEntry.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AbilityScalarValueEntry prototype) {
            return AbilityScalarValueEntry.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AbilityScalarValueEntry.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AbilityScalarValueEntry getDefaultInstance() {
            return AbilityScalarValueEntry.DEFAULT_INSTANCE;
        }
        
        public static Parser<AbilityScalarValueEntry> parser() {
            return AbilityScalarValueEntry.PARSER;
        }
        
        @Override
        public Parser<AbilityScalarValueEntry> getParserForType() {
            return AbilityScalarValueEntry.PARSER;
        }
        
        @Override
        public AbilityScalarValueEntry getDefaultInstanceForType() {
            return AbilityScalarValueEntry.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AbilityScalarValueEntry();
            PARSER = new AbstractParser<AbilityScalarValueEntry>() {
                @Override
                public AbilityScalarValueEntry parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AbilityScalarValueEntry(input, extensionRegistry);
                }
            };
        }
        
        public enum ValueCase implements Internal.EnumLite, InternalOneOfEnum
        {
            FLOAT_VALUE(3), 
            STRING_VALUE(4), 
            INT_VALUE(5), 
            UINT_VALUE(6), 
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
                    case 3: {
                        return ValueCase.FLOAT_VALUE;
                    }
                    case 4: {
                        return ValueCase.STRING_VALUE;
                    }
                    case 5: {
                        return ValueCase.INT_VALUE;
                    }
                    case 6: {
                        return ValueCase.UINT_VALUE;
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
                return new ValueCase[] { ValueCase.FLOAT_VALUE, ValueCase.STRING_VALUE, ValueCase.INT_VALUE, ValueCase.UINT_VALUE, ValueCase.VALUE_NOT_SET };
            }
            
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AbilityScalarValueEntryOrBuilder
        {
            private int valueCase_;
            private Object value_;
            private AbilityStringOuterClass.AbilityString key_;
            private SingleFieldBuilderV3<AbilityStringOuterClass.AbilityString, AbilityStringOuterClass.AbilityString.Builder, AbilityStringOuterClass.AbilityStringOrBuilder> keyBuilder_;
            private int valueType_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AbilityScalarValueEntryOuterClass.internal_static_AbilityScalarValueEntry_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AbilityScalarValueEntryOuterClass.internal_static_AbilityScalarValueEntry_fieldAccessorTable.ensureFieldAccessorsInitialized(AbilityScalarValueEntry.class, Builder.class);
            }
            
            private Builder() {
                this.valueCase_ = 0;
                this.valueType_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.valueCase_ = 0;
                this.valueType_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AbilityScalarValueEntry.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.keyBuilder_ == null) {
                    this.key_ = null;
                }
                else {
                    this.key_ = null;
                    this.keyBuilder_ = null;
                }
                this.valueType_ = 0;
                this.valueCase_ = 0;
                this.value_ = null;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AbilityScalarValueEntryOuterClass.internal_static_AbilityScalarValueEntry_descriptor;
            }
            
            @Override
            public AbilityScalarValueEntry getDefaultInstanceForType() {
                return AbilityScalarValueEntry.getDefaultInstance();
            }
            
            @Override
            public AbilityScalarValueEntry build() {
                final AbilityScalarValueEntry result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AbilityScalarValueEntry buildPartial() {
                final AbilityScalarValueEntry result = new AbilityScalarValueEntry(this);
                if (this.keyBuilder_ == null) {
                    result.key_ = this.key_;
                }
                else {
                    result.key_ = this.keyBuilder_.build();
                }
                result.valueType_ = this.valueType_;
                if (this.valueCase_ == 3) {
                    result.value_ = this.value_;
                }
                if (this.valueCase_ == 4) {
                    result.value_ = this.value_;
                }
                if (this.valueCase_ == 5) {
                    result.value_ = this.value_;
                }
                if (this.valueCase_ == 6) {
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
                if (other instanceof AbilityScalarValueEntry) {
                    return this.mergeFrom((AbilityScalarValueEntry)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AbilityScalarValueEntry other) {
                if (other == AbilityScalarValueEntry.getDefaultInstance()) {
                    return this;
                }
                if (other.hasKey()) {
                    this.mergeKey(other.getKey());
                }
                if (other.valueType_ != 0) {
                    this.setValueTypeValue(other.getValueTypeValue());
                }
                switch (other.getValueCase()) {
                    case FLOAT_VALUE: {
                        this.setFloatValue(other.getFloatValue());
                        break;
                    }
                    case STRING_VALUE: {
                        this.valueCase_ = 4;
                        this.value_ = other.value_;
                        this.onChanged();
                        break;
                    }
                    case INT_VALUE: {
                        this.setIntValue(other.getIntValue());
                        break;
                    }
                    case UINT_VALUE: {
                        this.setUintValue(other.getUintValue());
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
                AbilityScalarValueEntry parsedMessage = null;
                try {
                    parsedMessage = AbilityScalarValueEntry.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AbilityScalarValueEntry)e.getUnfinishedMessage();
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
            public boolean hasKey() {
                return this.keyBuilder_ != null || this.key_ != null;
            }
            
            @Override
            public AbilityStringOuterClass.AbilityString getKey() {
                if (this.keyBuilder_ == null) {
                    return (this.key_ == null) ? AbilityStringOuterClass.AbilityString.getDefaultInstance() : this.key_;
                }
                return this.keyBuilder_.getMessage();
            }
            
            public Builder setKey(final AbilityStringOuterClass.AbilityString value) {
                if (this.keyBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.key_ = value;
                    this.onChanged();
                }
                else {
                    this.keyBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setKey(final AbilityStringOuterClass.AbilityString.Builder builderForValue) {
                if (this.keyBuilder_ == null) {
                    this.key_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.keyBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeKey(final AbilityStringOuterClass.AbilityString value) {
                if (this.keyBuilder_ == null) {
                    if (this.key_ != null) {
                        this.key_ = AbilityStringOuterClass.AbilityString.newBuilder(this.key_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.key_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.keyBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearKey() {
                if (this.keyBuilder_ == null) {
                    this.key_ = null;
                    this.onChanged();
                }
                else {
                    this.key_ = null;
                    this.keyBuilder_ = null;
                }
                return this;
            }
            
            public AbilityStringOuterClass.AbilityString.Builder getKeyBuilder() {
                this.onChanged();
                return this.getKeyFieldBuilder().getBuilder();
            }
            
            @Override
            public AbilityStringOuterClass.AbilityStringOrBuilder getKeyOrBuilder() {
                if (this.keyBuilder_ != null) {
                    return this.keyBuilder_.getMessageOrBuilder();
                }
                return (this.key_ == null) ? AbilityStringOuterClass.AbilityString.getDefaultInstance() : this.key_;
            }
            
            private SingleFieldBuilderV3<AbilityStringOuterClass.AbilityString, AbilityStringOuterClass.AbilityString.Builder, AbilityStringOuterClass.AbilityStringOrBuilder> getKeyFieldBuilder() {
                if (this.keyBuilder_ == null) {
                    this.keyBuilder_ = new SingleFieldBuilderV3<AbilityStringOuterClass.AbilityString, AbilityStringOuterClass.AbilityString.Builder, AbilityStringOuterClass.AbilityStringOrBuilder>(this.getKey(), this.getParentForChildren(), this.isClean());
                    this.key_ = null;
                }
                return this.keyBuilder_;
            }
            
            @Override
            public int getValueTypeValue() {
                return this.valueType_;
            }
            
            public Builder setValueTypeValue(final int value) {
                this.valueType_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public AbilityScalarTypeOuterClass.AbilityScalarType getValueType() {
                final AbilityScalarTypeOuterClass.AbilityScalarType result = AbilityScalarTypeOuterClass.AbilityScalarType.valueOf(this.valueType_);
                return (result == null) ? AbilityScalarTypeOuterClass.AbilityScalarType.UNRECOGNIZED : result;
            }
            
            public Builder setValueType(final AbilityScalarTypeOuterClass.AbilityScalarType value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.valueType_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearValueType() {
                this.valueType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasFloatValue() {
                return this.valueCase_ == 3;
            }
            
            @Override
            public float getFloatValue() {
                if (this.valueCase_ == 3) {
                    return (float)this.value_;
                }
                return 0.0f;
            }
            
            public Builder setFloatValue(final float value) {
                this.valueCase_ = 3;
                this.value_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearFloatValue() {
                if (this.valueCase_ == 3) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                    this.onChanged();
                }
                return this;
            }
            
            @Override
            public boolean hasStringValue() {
                return this.valueCase_ == 4;
            }
            
            @Override
            public String getStringValue() {
                Object ref = "";
                if (this.valueCase_ == 4) {
                    ref = this.value_;
                }
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    if (this.valueCase_ == 4) {
                        this.value_ = s;
                    }
                    return s;
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getStringValueBytes() {
                Object ref = "";
                if (this.valueCase_ == 4) {
                    ref = this.value_;
                }
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    if (this.valueCase_ == 4) {
                        this.value_ = b;
                    }
                    return b;
                }
                return (ByteString)ref;
            }
            
            public Builder setStringValue(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.valueCase_ = 4;
                this.value_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearStringValue() {
                if (this.valueCase_ == 4) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                    this.onChanged();
                }
                return this;
            }
            
            public Builder setStringValueBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.valueCase_ = 4;
                this.value_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasIntValue() {
                return this.valueCase_ == 5;
            }
            
            @Override
            public int getIntValue() {
                if (this.valueCase_ == 5) {
                    return (int)this.value_;
                }
                return 0;
            }
            
            public Builder setIntValue(final int value) {
                this.valueCase_ = 5;
                this.value_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIntValue() {
                if (this.valueCase_ == 5) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                    this.onChanged();
                }
                return this;
            }
            
            @Override
            public boolean hasUintValue() {
                return this.valueCase_ == 6;
            }
            
            @Override
            public int getUintValue() {
                if (this.valueCase_ == 6) {
                    return (int)this.value_;
                }
                return 0;
            }
            
            public Builder setUintValue(final int value) {
                this.valueCase_ = 6;
                this.value_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUintValue() {
                if (this.valueCase_ == 6) {
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
    
    public interface AbilityScalarValueEntryOrBuilder extends MessageOrBuilder
    {
        boolean hasKey();
        
        AbilityStringOuterClass.AbilityString getKey();
        
        AbilityStringOuterClass.AbilityStringOrBuilder getKeyOrBuilder();
        
        int getValueTypeValue();
        
        AbilityScalarTypeOuterClass.AbilityScalarType getValueType();
        
        boolean hasFloatValue();
        
        float getFloatValue();
        
        boolean hasStringValue();
        
        String getStringValue();
        
        ByteString getStringValueBytes();
        
        boolean hasIntValue();
        
        int getIntValue();
        
        boolean hasUintValue();
        
        int getUintValue();
        
        AbilityScalarValueEntry.ValueCase getValueCase();
    }
}
