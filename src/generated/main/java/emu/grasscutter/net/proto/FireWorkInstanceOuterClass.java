// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
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

public final class FireWorkInstanceOuterClass
{
    private static final Descriptors.Descriptor internal_static_FireWorkInstance_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_FireWorkInstance_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private FireWorkInstanceOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return FireWorkInstanceOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016FireWorkInstance.proto\u001a\u0012FireWorkType.proto\">\n\u0010FireWorkInstance\u0012\u001b\n\u0004type\u0018\u0001 \u0001(\u000e2\r.FireWorkType\u0012\r\n\u0005value\u0018\u0002 \u0001(\u0005B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        FireWorkInstanceOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { FireWorkTypeOuterClass.getDescriptor() });
        internal_static_FireWorkInstance_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_FireWorkInstance_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(FireWorkInstanceOuterClass.internal_static_FireWorkInstance_descriptor, new String[] { "Type", "Value" });
        FireWorkTypeOuterClass.getDescriptor();
    }
    
    public static final class FireWorkInstance extends GeneratedMessageV3 implements FireWorkInstanceOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int type_;
        public static final int VALUE_FIELD_NUMBER = 2;
        private int value_;
        private byte memoizedIsInitialized;
        private static final FireWorkInstance DEFAULT_INSTANCE;
        private static final Parser<FireWorkInstance> PARSER;
        
        private FireWorkInstance(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private FireWorkInstance() {
            this.memoizedIsInitialized = -1;
            this.type_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new FireWorkInstance();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private FireWorkInstance(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            final int rawValue = input.readEnum();
                            this.type_ = rawValue;
                            continue;
                        }
                        case 16: {
                            this.value_ = input.readInt32();
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
            return FireWorkInstanceOuterClass.internal_static_FireWorkInstance_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return FireWorkInstanceOuterClass.internal_static_FireWorkInstance_fieldAccessorTable.ensureFieldAccessorsInitialized(FireWorkInstance.class, Builder.class);
        }
        
        @Override
        public int getTypeValue() {
            return this.type_;
        }
        
        @Override
        public FireWorkTypeOuterClass.FireWorkType getType() {
            final FireWorkTypeOuterClass.FireWorkType result = FireWorkTypeOuterClass.FireWorkType.valueOf(this.type_);
            return (result == null) ? FireWorkTypeOuterClass.FireWorkType.UNRECOGNIZED : result;
        }
        
        @Override
        public int getValue() {
            return this.value_;
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
            if (this.type_ != FireWorkTypeOuterClass.FireWorkType.FireWorkType_ODJKANKMPPJ.getNumber()) {
                output.writeEnum(1, this.type_);
            }
            if (this.value_ != 0) {
                output.writeInt32(2, this.value_);
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
            if (this.type_ != FireWorkTypeOuterClass.FireWorkType.FireWorkType_ODJKANKMPPJ.getNumber()) {
                size += CodedOutputStream.computeEnumSize(1, this.type_);
            }
            if (this.value_ != 0) {
                size += CodedOutputStream.computeInt32Size(2, this.value_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FireWorkInstance)) {
                return super.equals(obj);
            }
            final FireWorkInstance other = (FireWorkInstance)obj;
            return this.type_ == other.type_ && this.getValue() == other.getValue() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.type_;
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getValue();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static FireWorkInstance parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return FireWorkInstance.PARSER.parseFrom(data);
        }
        
        public static FireWorkInstance parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FireWorkInstance.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FireWorkInstance parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return FireWorkInstance.PARSER.parseFrom(data);
        }
        
        public static FireWorkInstance parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FireWorkInstance.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FireWorkInstance parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return FireWorkInstance.PARSER.parseFrom(data);
        }
        
        public static FireWorkInstance parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FireWorkInstance.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FireWorkInstance parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FireWorkInstance.PARSER, input);
        }
        
        public static FireWorkInstance parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FireWorkInstance.PARSER, input, extensionRegistry);
        }
        
        public static FireWorkInstance parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FireWorkInstance.PARSER, input);
        }
        
        public static FireWorkInstance parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FireWorkInstance.PARSER, input, extensionRegistry);
        }
        
        public static FireWorkInstance parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FireWorkInstance.PARSER, input);
        }
        
        public static FireWorkInstance parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FireWorkInstance.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return FireWorkInstance.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final FireWorkInstance prototype) {
            return FireWorkInstance.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == FireWorkInstance.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static FireWorkInstance getDefaultInstance() {
            return FireWorkInstance.DEFAULT_INSTANCE;
        }
        
        public static Parser<FireWorkInstance> parser() {
            return FireWorkInstance.PARSER;
        }
        
        @Override
        public Parser<FireWorkInstance> getParserForType() {
            return FireWorkInstance.PARSER;
        }
        
        @Override
        public FireWorkInstance getDefaultInstanceForType() {
            return FireWorkInstance.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new FireWorkInstance();
            PARSER = new AbstractParser<FireWorkInstance>() {
                @Override
                public FireWorkInstance parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new FireWorkInstance(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FireWorkInstanceOrBuilder
        {
            private int type_;
            private int value_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return FireWorkInstanceOuterClass.internal_static_FireWorkInstance_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return FireWorkInstanceOuterClass.internal_static_FireWorkInstance_fieldAccessorTable.ensureFieldAccessorsInitialized(FireWorkInstance.class, Builder.class);
            }
            
            private Builder() {
                this.type_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.type_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (FireWorkInstance.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.type_ = 0;
                this.value_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return FireWorkInstanceOuterClass.internal_static_FireWorkInstance_descriptor;
            }
            
            @Override
            public FireWorkInstance getDefaultInstanceForType() {
                return FireWorkInstance.getDefaultInstance();
            }
            
            @Override
            public FireWorkInstance build() {
                final FireWorkInstance result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public FireWorkInstance buildPartial() {
                final FireWorkInstance result = new FireWorkInstance(this);
                result.type_ = this.type_;
                result.value_ = this.value_;
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
                if (other instanceof FireWorkInstance) {
                    return this.mergeFrom((FireWorkInstance)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final FireWorkInstance other) {
                if (other == FireWorkInstance.getDefaultInstance()) {
                    return this;
                }
                if (other.type_ != 0) {
                    this.setTypeValue(other.getTypeValue());
                }
                if (other.getValue() != 0) {
                    this.setValue(other.getValue());
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
                FireWorkInstance parsedMessage = null;
                try {
                    parsedMessage = FireWorkInstance.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (FireWorkInstance)e.getUnfinishedMessage();
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
            public int getTypeValue() {
                return this.type_;
            }
            
            public Builder setTypeValue(final int value) {
                this.type_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public FireWorkTypeOuterClass.FireWorkType getType() {
                final FireWorkTypeOuterClass.FireWorkType result = FireWorkTypeOuterClass.FireWorkType.valueOf(this.type_);
                return (result == null) ? FireWorkTypeOuterClass.FireWorkType.UNRECOGNIZED : result;
            }
            
            public Builder setType(final FireWorkTypeOuterClass.FireWorkType value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.type_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearType() {
                this.type_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getValue() {
                return this.value_;
            }
            
            public Builder setValue(final int value) {
                this.value_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearValue() {
                this.value_ = 0;
                this.onChanged();
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
    
    public interface FireWorkInstanceOrBuilder extends MessageOrBuilder
    {
        int getTypeValue();
        
        FireWorkTypeOuterClass.FireWorkType getType();
        
        int getValue();
    }
}
