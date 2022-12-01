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

public final class DealAddFriendReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_DealAddFriendReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_DealAddFriendReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private DealAddFriendReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return DealAddFriendReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016DealAddFriendReq.proto\u001a\u001dDealAddFriendResultType.proto\"`\n\u0010DealAddFriendReq\u00128\n\u0016deal_add_friend_result\u0018\f \u0001(\u000e2\u0018.DealAddFriendResultType\u0012\u0012\n\ntarget_uid\u0018\n \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        DealAddFriendReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { DealAddFriendResultTypeOuterClass.getDescriptor() });
        internal_static_DealAddFriendReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_DealAddFriendReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(DealAddFriendReqOuterClass.internal_static_DealAddFriendReq_descriptor, new String[] { "DealAddFriendResult", "TargetUid" });
        DealAddFriendResultTypeOuterClass.getDescriptor();
    }
    
    public static final class DealAddFriendReq extends GeneratedMessageV3 implements DealAddFriendReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int DEAL_ADD_FRIEND_RESULT_FIELD_NUMBER = 12;
        private int dealAddFriendResult_;
        public static final int TARGET_UID_FIELD_NUMBER = 10;
        private int targetUid_;
        private byte memoizedIsInitialized;
        private static final DealAddFriendReq DEFAULT_INSTANCE;
        private static final Parser<DealAddFriendReq> PARSER;
        
        private DealAddFriendReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private DealAddFriendReq() {
            this.memoizedIsInitialized = -1;
            this.dealAddFriendResult_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new DealAddFriendReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private DealAddFriendReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 80: {
                            this.targetUid_ = input.readUInt32();
                            continue;
                        }
                        case 96: {
                            final int rawValue = input.readEnum();
                            this.dealAddFriendResult_ = rawValue;
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
            return DealAddFriendReqOuterClass.internal_static_DealAddFriendReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return DealAddFriendReqOuterClass.internal_static_DealAddFriendReq_fieldAccessorTable.ensureFieldAccessorsInitialized(DealAddFriendReq.class, Builder.class);
        }
        
        @Override
        public int getDealAddFriendResultValue() {
            return this.dealAddFriendResult_;
        }
        
        @Override
        public DealAddFriendResultTypeOuterClass.DealAddFriendResultType getDealAddFriendResult() {
            final DealAddFriendResultTypeOuterClass.DealAddFriendResultType result = DealAddFriendResultTypeOuterClass.DealAddFriendResultType.valueOf(this.dealAddFriendResult_);
            return (result == null) ? DealAddFriendResultTypeOuterClass.DealAddFriendResultType.UNRECOGNIZED : result;
        }
        
        @Override
        public int getTargetUid() {
            return this.targetUid_;
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
            if (this.targetUid_ != 0) {
                output.writeUInt32(10, this.targetUid_);
            }
            if (this.dealAddFriendResult_ != DealAddFriendResultTypeOuterClass.DealAddFriendResultType.DEAL_ADD_FRIEND_RESULT_TYPE_REJECT.getNumber()) {
                output.writeEnum(12, this.dealAddFriendResult_);
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
            if (this.targetUid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.targetUid_);
            }
            if (this.dealAddFriendResult_ != DealAddFriendResultTypeOuterClass.DealAddFriendResultType.DEAL_ADD_FRIEND_RESULT_TYPE_REJECT.getNumber()) {
                size += CodedOutputStream.computeEnumSize(12, this.dealAddFriendResult_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DealAddFriendReq)) {
                return super.equals(obj);
            }
            final DealAddFriendReq other = (DealAddFriendReq)obj;
            return this.dealAddFriendResult_ == other.dealAddFriendResult_ && this.getTargetUid() == other.getTargetUid() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.dealAddFriendResult_;
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getTargetUid();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static DealAddFriendReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return DealAddFriendReq.PARSER.parseFrom(data);
        }
        
        public static DealAddFriendReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DealAddFriendReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DealAddFriendReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return DealAddFriendReq.PARSER.parseFrom(data);
        }
        
        public static DealAddFriendReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DealAddFriendReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DealAddFriendReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return DealAddFriendReq.PARSER.parseFrom(data);
        }
        
        public static DealAddFriendReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DealAddFriendReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DealAddFriendReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DealAddFriendReq.PARSER, input);
        }
        
        public static DealAddFriendReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DealAddFriendReq.PARSER, input, extensionRegistry);
        }
        
        public static DealAddFriendReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(DealAddFriendReq.PARSER, input);
        }
        
        public static DealAddFriendReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(DealAddFriendReq.PARSER, input, extensionRegistry);
        }
        
        public static DealAddFriendReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DealAddFriendReq.PARSER, input);
        }
        
        public static DealAddFriendReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DealAddFriendReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return DealAddFriendReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final DealAddFriendReq prototype) {
            return DealAddFriendReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == DealAddFriendReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static DealAddFriendReq getDefaultInstance() {
            return DealAddFriendReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<DealAddFriendReq> parser() {
            return DealAddFriendReq.PARSER;
        }
        
        @Override
        public Parser<DealAddFriendReq> getParserForType() {
            return DealAddFriendReq.PARSER;
        }
        
        @Override
        public DealAddFriendReq getDefaultInstanceForType() {
            return DealAddFriendReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new DealAddFriendReq();
            PARSER = new AbstractParser<DealAddFriendReq>() {
                @Override
                public DealAddFriendReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new DealAddFriendReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DealAddFriendReqOrBuilder
        {
            private int dealAddFriendResult_;
            private int targetUid_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return DealAddFriendReqOuterClass.internal_static_DealAddFriendReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return DealAddFriendReqOuterClass.internal_static_DealAddFriendReq_fieldAccessorTable.ensureFieldAccessorsInitialized(DealAddFriendReq.class, Builder.class);
            }
            
            private Builder() {
                this.dealAddFriendResult_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.dealAddFriendResult_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (DealAddFriendReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.dealAddFriendResult_ = 0;
                this.targetUid_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return DealAddFriendReqOuterClass.internal_static_DealAddFriendReq_descriptor;
            }
            
            @Override
            public DealAddFriendReq getDefaultInstanceForType() {
                return DealAddFriendReq.getDefaultInstance();
            }
            
            @Override
            public DealAddFriendReq build() {
                final DealAddFriendReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public DealAddFriendReq buildPartial() {
                final DealAddFriendReq result = new DealAddFriendReq(this);
                result.dealAddFriendResult_ = this.dealAddFriendResult_;
                result.targetUid_ = this.targetUid_;
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
                if (other instanceof DealAddFriendReq) {
                    return this.mergeFrom((DealAddFriendReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final DealAddFriendReq other) {
                if (other == DealAddFriendReq.getDefaultInstance()) {
                    return this;
                }
                if (other.dealAddFriendResult_ != 0) {
                    this.setDealAddFriendResultValue(other.getDealAddFriendResultValue());
                }
                if (other.getTargetUid() != 0) {
                    this.setTargetUid(other.getTargetUid());
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
                DealAddFriendReq parsedMessage = null;
                try {
                    parsedMessage = DealAddFriendReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (DealAddFriendReq)e.getUnfinishedMessage();
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
            public int getDealAddFriendResultValue() {
                return this.dealAddFriendResult_;
            }
            
            public Builder setDealAddFriendResultValue(final int value) {
                this.dealAddFriendResult_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public DealAddFriendResultTypeOuterClass.DealAddFriendResultType getDealAddFriendResult() {
                final DealAddFriendResultTypeOuterClass.DealAddFriendResultType result = DealAddFriendResultTypeOuterClass.DealAddFriendResultType.valueOf(this.dealAddFriendResult_);
                return (result == null) ? DealAddFriendResultTypeOuterClass.DealAddFriendResultType.UNRECOGNIZED : result;
            }
            
            public Builder setDealAddFriendResult(final DealAddFriendResultTypeOuterClass.DealAddFriendResultType value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.dealAddFriendResult_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearDealAddFriendResult() {
                this.dealAddFriendResult_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getTargetUid() {
                return this.targetUid_;
            }
            
            public Builder setTargetUid(final int value) {
                this.targetUid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTargetUid() {
                this.targetUid_ = 0;
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
    
    public interface DealAddFriendReqOrBuilder extends MessageOrBuilder
    {
        int getDealAddFriendResultValue();
        
        DealAddFriendResultTypeOuterClass.DealAddFriendResultType getDealAddFriendResult();
        
        int getTargetUid();
    }
}
