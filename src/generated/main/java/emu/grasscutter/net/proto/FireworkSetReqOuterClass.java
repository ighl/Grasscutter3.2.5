// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
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

public final class FireworkSetReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_FireworkSetReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_FireworkSetReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private FireworkSetReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return FireworkSetReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0014FireworkSetReq.proto\u001a\u0015FireworkSetData.proto\"0\n\u000eFireworkSetReq\u0012\u001e\n\u0004data\u0018\u0002 \u0001(\u000b2\u0010.FireworkSetDataB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        FireworkSetReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { FireworkSetDataOuterClass.getDescriptor() });
        internal_static_FireworkSetReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_FireworkSetReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(FireworkSetReqOuterClass.internal_static_FireworkSetReq_descriptor, new String[] { "Data" });
        FireworkSetDataOuterClass.getDescriptor();
    }
    
    public static final class FireworkSetReq extends GeneratedMessageV3 implements FireworkSetReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int DATA_FIELD_NUMBER = 2;
        private FireworkSetDataOuterClass.FireworkSetData data_;
        private byte memoizedIsInitialized;
        private static final FireworkSetReq DEFAULT_INSTANCE;
        private static final Parser<FireworkSetReq> PARSER;
        
        private FireworkSetReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private FireworkSetReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new FireworkSetReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private FireworkSetReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 18: {
                            FireworkSetDataOuterClass.FireworkSetData.Builder subBuilder = null;
                            if (this.data_ != null) {
                                subBuilder = this.data_.toBuilder();
                            }
                            this.data_ = input.readMessage(FireworkSetDataOuterClass.FireworkSetData.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.data_);
                                this.data_ = subBuilder.buildPartial();
                                continue;
                            }
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
            return FireworkSetReqOuterClass.internal_static_FireworkSetReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return FireworkSetReqOuterClass.internal_static_FireworkSetReq_fieldAccessorTable.ensureFieldAccessorsInitialized(FireworkSetReq.class, Builder.class);
        }
        
        @Override
        public boolean hasData() {
            return this.data_ != null;
        }
        
        @Override
        public FireworkSetDataOuterClass.FireworkSetData getData() {
            return (this.data_ == null) ? FireworkSetDataOuterClass.FireworkSetData.getDefaultInstance() : this.data_;
        }
        
        @Override
        public FireworkSetDataOuterClass.FireworkSetDataOrBuilder getDataOrBuilder() {
            return this.getData();
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
            if (this.data_ != null) {
                output.writeMessage(2, this.getData());
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
            if (this.data_ != null) {
                size += CodedOutputStream.computeMessageSize(2, this.getData());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FireworkSetReq)) {
                return super.equals(obj);
            }
            final FireworkSetReq other = (FireworkSetReq)obj;
            return this.hasData() == other.hasData() && (!this.hasData() || this.getData().equals(other.getData())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasData()) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getData().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static FireworkSetReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return FireworkSetReq.PARSER.parseFrom(data);
        }
        
        public static FireworkSetReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FireworkSetReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FireworkSetReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return FireworkSetReq.PARSER.parseFrom(data);
        }
        
        public static FireworkSetReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FireworkSetReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FireworkSetReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return FireworkSetReq.PARSER.parseFrom(data);
        }
        
        public static FireworkSetReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FireworkSetReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FireworkSetReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FireworkSetReq.PARSER, input);
        }
        
        public static FireworkSetReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FireworkSetReq.PARSER, input, extensionRegistry);
        }
        
        public static FireworkSetReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FireworkSetReq.PARSER, input);
        }
        
        public static FireworkSetReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FireworkSetReq.PARSER, input, extensionRegistry);
        }
        
        public static FireworkSetReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FireworkSetReq.PARSER, input);
        }
        
        public static FireworkSetReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FireworkSetReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return FireworkSetReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final FireworkSetReq prototype) {
            return FireworkSetReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == FireworkSetReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static FireworkSetReq getDefaultInstance() {
            return FireworkSetReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<FireworkSetReq> parser() {
            return FireworkSetReq.PARSER;
        }
        
        @Override
        public Parser<FireworkSetReq> getParserForType() {
            return FireworkSetReq.PARSER;
        }
        
        @Override
        public FireworkSetReq getDefaultInstanceForType() {
            return FireworkSetReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new FireworkSetReq();
            PARSER = new AbstractParser<FireworkSetReq>() {
                @Override
                public FireworkSetReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new FireworkSetReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FireworkSetReqOrBuilder
        {
            private FireworkSetDataOuterClass.FireworkSetData data_;
            private SingleFieldBuilderV3<FireworkSetDataOuterClass.FireworkSetData, FireworkSetDataOuterClass.FireworkSetData.Builder, FireworkSetDataOuterClass.FireworkSetDataOrBuilder> dataBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return FireworkSetReqOuterClass.internal_static_FireworkSetReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return FireworkSetReqOuterClass.internal_static_FireworkSetReq_fieldAccessorTable.ensureFieldAccessorsInitialized(FireworkSetReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (FireworkSetReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.dataBuilder_ == null) {
                    this.data_ = null;
                }
                else {
                    this.data_ = null;
                    this.dataBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return FireworkSetReqOuterClass.internal_static_FireworkSetReq_descriptor;
            }
            
            @Override
            public FireworkSetReq getDefaultInstanceForType() {
                return FireworkSetReq.getDefaultInstance();
            }
            
            @Override
            public FireworkSetReq build() {
                final FireworkSetReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public FireworkSetReq buildPartial() {
                final FireworkSetReq result = new FireworkSetReq(this);
                if (this.dataBuilder_ == null) {
                    result.data_ = this.data_;
                }
                else {
                    result.data_ = this.dataBuilder_.build();
                }
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
                if (other instanceof FireworkSetReq) {
                    return this.mergeFrom((FireworkSetReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final FireworkSetReq other) {
                if (other == FireworkSetReq.getDefaultInstance()) {
                    return this;
                }
                if (other.hasData()) {
                    this.mergeData(other.getData());
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
                FireworkSetReq parsedMessage = null;
                try {
                    parsedMessage = FireworkSetReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (FireworkSetReq)e.getUnfinishedMessage();
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
            public boolean hasData() {
                return this.dataBuilder_ != null || this.data_ != null;
            }
            
            @Override
            public FireworkSetDataOuterClass.FireworkSetData getData() {
                if (this.dataBuilder_ == null) {
                    return (this.data_ == null) ? FireworkSetDataOuterClass.FireworkSetData.getDefaultInstance() : this.data_;
                }
                return this.dataBuilder_.getMessage();
            }
            
            public Builder setData(final FireworkSetDataOuterClass.FireworkSetData value) {
                if (this.dataBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.data_ = value;
                    this.onChanged();
                }
                else {
                    this.dataBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setData(final FireworkSetDataOuterClass.FireworkSetData.Builder builderForValue) {
                if (this.dataBuilder_ == null) {
                    this.data_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.dataBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeData(final FireworkSetDataOuterClass.FireworkSetData value) {
                if (this.dataBuilder_ == null) {
                    if (this.data_ != null) {
                        this.data_ = FireworkSetDataOuterClass.FireworkSetData.newBuilder(this.data_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.data_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.dataBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearData() {
                if (this.dataBuilder_ == null) {
                    this.data_ = null;
                    this.onChanged();
                }
                else {
                    this.data_ = null;
                    this.dataBuilder_ = null;
                }
                return this;
            }
            
            public FireworkSetDataOuterClass.FireworkSetData.Builder getDataBuilder() {
                this.onChanged();
                return this.getDataFieldBuilder().getBuilder();
            }
            
            @Override
            public FireworkSetDataOuterClass.FireworkSetDataOrBuilder getDataOrBuilder() {
                if (this.dataBuilder_ != null) {
                    return this.dataBuilder_.getMessageOrBuilder();
                }
                return (this.data_ == null) ? FireworkSetDataOuterClass.FireworkSetData.getDefaultInstance() : this.data_;
            }
            
            private SingleFieldBuilderV3<FireworkSetDataOuterClass.FireworkSetData, FireworkSetDataOuterClass.FireworkSetData.Builder, FireworkSetDataOuterClass.FireworkSetDataOrBuilder> getDataFieldBuilder() {
                if (this.dataBuilder_ == null) {
                    this.dataBuilder_ = new SingleFieldBuilderV3<FireworkSetDataOuterClass.FireworkSetData, FireworkSetDataOuterClass.FireworkSetData.Builder, FireworkSetDataOuterClass.FireworkSetDataOrBuilder>(this.getData(), this.getParentForChildren(), this.isClean());
                    this.data_ = null;
                }
                return this.dataBuilder_;
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
    
    public interface FireworkSetReqOrBuilder extends MessageOrBuilder
    {
        boolean hasData();
        
        FireworkSetDataOuterClass.FireworkSetData getData();
        
        FireworkSetDataOuterClass.FireworkSetDataOrBuilder getDataOrBuilder();
    }
}
