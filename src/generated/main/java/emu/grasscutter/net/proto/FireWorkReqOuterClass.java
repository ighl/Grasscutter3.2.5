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

public final class FireWorkReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_FireWorkReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_FireWorkReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private FireWorkReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return FireWorkReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0011FireWorkReq.proto\u001a\u0012FireWorkData.proto\"2\n\u000bFireWorkReq\u0012#\n\ffireWorkData\u0018\u0007 \u0001(\u000b2\r.FireWorkDataB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        FireWorkReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { FireWorkDataOuterClass.getDescriptor() });
        internal_static_FireWorkReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_FireWorkReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(FireWorkReqOuterClass.internal_static_FireWorkReq_descriptor, new String[] { "FireWorkData" });
        FireWorkDataOuterClass.getDescriptor();
    }
    
    public static final class FireWorkReq extends GeneratedMessageV3 implements FireWorkReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int FIREWORKDATA_FIELD_NUMBER = 7;
        private FireWorkDataOuterClass.FireWorkData fireWorkData_;
        private byte memoizedIsInitialized;
        private static final FireWorkReq DEFAULT_INSTANCE;
        private static final Parser<FireWorkReq> PARSER;
        
        private FireWorkReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private FireWorkReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new FireWorkReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private FireWorkReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 58: {
                            FireWorkDataOuterClass.FireWorkData.Builder subBuilder = null;
                            if (this.fireWorkData_ != null) {
                                subBuilder = this.fireWorkData_.toBuilder();
                            }
                            this.fireWorkData_ = input.readMessage(FireWorkDataOuterClass.FireWorkData.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.fireWorkData_);
                                this.fireWorkData_ = subBuilder.buildPartial();
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
            return FireWorkReqOuterClass.internal_static_FireWorkReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return FireWorkReqOuterClass.internal_static_FireWorkReq_fieldAccessorTable.ensureFieldAccessorsInitialized(FireWorkReq.class, Builder.class);
        }
        
        @Override
        public boolean hasFireWorkData() {
            return this.fireWorkData_ != null;
        }
        
        @Override
        public FireWorkDataOuterClass.FireWorkData getFireWorkData() {
            return (this.fireWorkData_ == null) ? FireWorkDataOuterClass.FireWorkData.getDefaultInstance() : this.fireWorkData_;
        }
        
        @Override
        public FireWorkDataOuterClass.FireWorkDataOrBuilder getFireWorkDataOrBuilder() {
            return this.getFireWorkData();
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
            if (this.fireWorkData_ != null) {
                output.writeMessage(7, this.getFireWorkData());
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
            if (this.fireWorkData_ != null) {
                size += CodedOutputStream.computeMessageSize(7, this.getFireWorkData());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FireWorkReq)) {
                return super.equals(obj);
            }
            final FireWorkReq other = (FireWorkReq)obj;
            return this.hasFireWorkData() == other.hasFireWorkData() && (!this.hasFireWorkData() || this.getFireWorkData().equals(other.getFireWorkData())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasFireWorkData()) {
                hash = 37 * hash + 7;
                hash = 53 * hash + this.getFireWorkData().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static FireWorkReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return FireWorkReq.PARSER.parseFrom(data);
        }
        
        public static FireWorkReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FireWorkReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FireWorkReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return FireWorkReq.PARSER.parseFrom(data);
        }
        
        public static FireWorkReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FireWorkReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FireWorkReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return FireWorkReq.PARSER.parseFrom(data);
        }
        
        public static FireWorkReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FireWorkReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FireWorkReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FireWorkReq.PARSER, input);
        }
        
        public static FireWorkReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FireWorkReq.PARSER, input, extensionRegistry);
        }
        
        public static FireWorkReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FireWorkReq.PARSER, input);
        }
        
        public static FireWorkReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FireWorkReq.PARSER, input, extensionRegistry);
        }
        
        public static FireWorkReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FireWorkReq.PARSER, input);
        }
        
        public static FireWorkReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FireWorkReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return FireWorkReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final FireWorkReq prototype) {
            return FireWorkReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == FireWorkReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static FireWorkReq getDefaultInstance() {
            return FireWorkReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<FireWorkReq> parser() {
            return FireWorkReq.PARSER;
        }
        
        @Override
        public Parser<FireWorkReq> getParserForType() {
            return FireWorkReq.PARSER;
        }
        
        @Override
        public FireWorkReq getDefaultInstanceForType() {
            return FireWorkReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new FireWorkReq();
            PARSER = new AbstractParser<FireWorkReq>() {
                @Override
                public FireWorkReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new FireWorkReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FireWorkReqOrBuilder
        {
            private FireWorkDataOuterClass.FireWorkData fireWorkData_;
            private SingleFieldBuilderV3<FireWorkDataOuterClass.FireWorkData, FireWorkDataOuterClass.FireWorkData.Builder, FireWorkDataOuterClass.FireWorkDataOrBuilder> fireWorkDataBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return FireWorkReqOuterClass.internal_static_FireWorkReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return FireWorkReqOuterClass.internal_static_FireWorkReq_fieldAccessorTable.ensureFieldAccessorsInitialized(FireWorkReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (FireWorkReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.fireWorkDataBuilder_ == null) {
                    this.fireWorkData_ = null;
                }
                else {
                    this.fireWorkData_ = null;
                    this.fireWorkDataBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return FireWorkReqOuterClass.internal_static_FireWorkReq_descriptor;
            }
            
            @Override
            public FireWorkReq getDefaultInstanceForType() {
                return FireWorkReq.getDefaultInstance();
            }
            
            @Override
            public FireWorkReq build() {
                final FireWorkReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public FireWorkReq buildPartial() {
                final FireWorkReq result = new FireWorkReq(this);
                if (this.fireWorkDataBuilder_ == null) {
                    result.fireWorkData_ = this.fireWorkData_;
                }
                else {
                    result.fireWorkData_ = this.fireWorkDataBuilder_.build();
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
                if (other instanceof FireWorkReq) {
                    return this.mergeFrom((FireWorkReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final FireWorkReq other) {
                if (other == FireWorkReq.getDefaultInstance()) {
                    return this;
                }
                if (other.hasFireWorkData()) {
                    this.mergeFireWorkData(other.getFireWorkData());
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
                FireWorkReq parsedMessage = null;
                try {
                    parsedMessage = FireWorkReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (FireWorkReq)e.getUnfinishedMessage();
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
            public boolean hasFireWorkData() {
                return this.fireWorkDataBuilder_ != null || this.fireWorkData_ != null;
            }
            
            @Override
            public FireWorkDataOuterClass.FireWorkData getFireWorkData() {
                if (this.fireWorkDataBuilder_ == null) {
                    return (this.fireWorkData_ == null) ? FireWorkDataOuterClass.FireWorkData.getDefaultInstance() : this.fireWorkData_;
                }
                return this.fireWorkDataBuilder_.getMessage();
            }
            
            public Builder setFireWorkData(final FireWorkDataOuterClass.FireWorkData value) {
                if (this.fireWorkDataBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.fireWorkData_ = value;
                    this.onChanged();
                }
                else {
                    this.fireWorkDataBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setFireWorkData(final FireWorkDataOuterClass.FireWorkData.Builder builderForValue) {
                if (this.fireWorkDataBuilder_ == null) {
                    this.fireWorkData_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.fireWorkDataBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeFireWorkData(final FireWorkDataOuterClass.FireWorkData value) {
                if (this.fireWorkDataBuilder_ == null) {
                    if (this.fireWorkData_ != null) {
                        this.fireWorkData_ = FireWorkDataOuterClass.FireWorkData.newBuilder(this.fireWorkData_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.fireWorkData_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.fireWorkDataBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearFireWorkData() {
                if (this.fireWorkDataBuilder_ == null) {
                    this.fireWorkData_ = null;
                    this.onChanged();
                }
                else {
                    this.fireWorkData_ = null;
                    this.fireWorkDataBuilder_ = null;
                }
                return this;
            }
            
            public FireWorkDataOuterClass.FireWorkData.Builder getFireWorkDataBuilder() {
                this.onChanged();
                return this.getFireWorkDataFieldBuilder().getBuilder();
            }
            
            @Override
            public FireWorkDataOuterClass.FireWorkDataOrBuilder getFireWorkDataOrBuilder() {
                if (this.fireWorkDataBuilder_ != null) {
                    return this.fireWorkDataBuilder_.getMessageOrBuilder();
                }
                return (this.fireWorkData_ == null) ? FireWorkDataOuterClass.FireWorkData.getDefaultInstance() : this.fireWorkData_;
            }
            
            private SingleFieldBuilderV3<FireWorkDataOuterClass.FireWorkData, FireWorkDataOuterClass.FireWorkData.Builder, FireWorkDataOuterClass.FireWorkDataOrBuilder> getFireWorkDataFieldBuilder() {
                if (this.fireWorkDataBuilder_ == null) {
                    this.fireWorkDataBuilder_ = new SingleFieldBuilderV3<FireWorkDataOuterClass.FireWorkData, FireWorkDataOuterClass.FireWorkData.Builder, FireWorkDataOuterClass.FireWorkDataOrBuilder>(this.getFireWorkData(), this.getParentForChildren(), this.isClean());
                    this.fireWorkData_ = null;
                }
                return this.fireWorkDataBuilder_;
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
    
    public interface FireWorkReqOrBuilder extends MessageOrBuilder
    {
        boolean hasFireWorkData();
        
        FireWorkDataOuterClass.FireWorkData getFireWorkData();
        
        FireWorkDataOuterClass.FireWorkDataOrBuilder getFireWorkDataOrBuilder();
    }
}
