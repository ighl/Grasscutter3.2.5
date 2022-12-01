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

public final class TryEnterHomeReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_TryEnterHomeReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_TryEnterHomeReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private TryEnterHomeReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return TryEnterHomeReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0015TryEnterHomeReq.proto\";\n\u000fTryEnterHomeReq\u0012\u0012\n\ntarget_uid\u0018\u0003 \u0001(\r\u0012\u0014\n\ftarget_point\u0018\t \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        TryEnterHomeReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_TryEnterHomeReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_TryEnterHomeReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(TryEnterHomeReqOuterClass.internal_static_TryEnterHomeReq_descriptor, new String[] { "TargetUid", "TargetPoint" });
    }
    
    public static final class TryEnterHomeReq extends GeneratedMessageV3 implements TryEnterHomeReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int TARGET_UID_FIELD_NUMBER = 3;
        private int targetUid_;
        public static final int TARGET_POINT_FIELD_NUMBER = 9;
        private int targetPoint_;
        private byte memoizedIsInitialized;
        private static final TryEnterHomeReq DEFAULT_INSTANCE;
        private static final Parser<TryEnterHomeReq> PARSER;
        
        private TryEnterHomeReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private TryEnterHomeReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new TryEnterHomeReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private TryEnterHomeReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 24: {
                            this.targetUid_ = input.readUInt32();
                            continue;
                        }
                        case 72: {
                            this.targetPoint_ = input.readUInt32();
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
            return TryEnterHomeReqOuterClass.internal_static_TryEnterHomeReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return TryEnterHomeReqOuterClass.internal_static_TryEnterHomeReq_fieldAccessorTable.ensureFieldAccessorsInitialized(TryEnterHomeReq.class, Builder.class);
        }
        
        @Override
        public int getTargetUid() {
            return this.targetUid_;
        }
        
        @Override
        public int getTargetPoint() {
            return this.targetPoint_;
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
                output.writeUInt32(3, this.targetUid_);
            }
            if (this.targetPoint_ != 0) {
                output.writeUInt32(9, this.targetPoint_);
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
                size += CodedOutputStream.computeUInt32Size(3, this.targetUid_);
            }
            if (this.targetPoint_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.targetPoint_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TryEnterHomeReq)) {
                return super.equals(obj);
            }
            final TryEnterHomeReq other = (TryEnterHomeReq)obj;
            return this.getTargetUid() == other.getTargetUid() && this.getTargetPoint() == other.getTargetPoint() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getTargetUid();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getTargetPoint();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static TryEnterHomeReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return TryEnterHomeReq.PARSER.parseFrom(data);
        }
        
        public static TryEnterHomeReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TryEnterHomeReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TryEnterHomeReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return TryEnterHomeReq.PARSER.parseFrom(data);
        }
        
        public static TryEnterHomeReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TryEnterHomeReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TryEnterHomeReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return TryEnterHomeReq.PARSER.parseFrom(data);
        }
        
        public static TryEnterHomeReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TryEnterHomeReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TryEnterHomeReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TryEnterHomeReq.PARSER, input);
        }
        
        public static TryEnterHomeReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TryEnterHomeReq.PARSER, input, extensionRegistry);
        }
        
        public static TryEnterHomeReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TryEnterHomeReq.PARSER, input);
        }
        
        public static TryEnterHomeReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TryEnterHomeReq.PARSER, input, extensionRegistry);
        }
        
        public static TryEnterHomeReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TryEnterHomeReq.PARSER, input);
        }
        
        public static TryEnterHomeReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TryEnterHomeReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return TryEnterHomeReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final TryEnterHomeReq prototype) {
            return TryEnterHomeReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == TryEnterHomeReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static TryEnterHomeReq getDefaultInstance() {
            return TryEnterHomeReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<TryEnterHomeReq> parser() {
            return TryEnterHomeReq.PARSER;
        }
        
        @Override
        public Parser<TryEnterHomeReq> getParserForType() {
            return TryEnterHomeReq.PARSER;
        }
        
        @Override
        public TryEnterHomeReq getDefaultInstanceForType() {
            return TryEnterHomeReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new TryEnterHomeReq();
            PARSER = new AbstractParser<TryEnterHomeReq>() {
                @Override
                public TryEnterHomeReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new TryEnterHomeReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TryEnterHomeReqOrBuilder
        {
            private int targetUid_;
            private int targetPoint_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return TryEnterHomeReqOuterClass.internal_static_TryEnterHomeReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return TryEnterHomeReqOuterClass.internal_static_TryEnterHomeReq_fieldAccessorTable.ensureFieldAccessorsInitialized(TryEnterHomeReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (TryEnterHomeReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.targetUid_ = 0;
                this.targetPoint_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return TryEnterHomeReqOuterClass.internal_static_TryEnterHomeReq_descriptor;
            }
            
            @Override
            public TryEnterHomeReq getDefaultInstanceForType() {
                return TryEnterHomeReq.getDefaultInstance();
            }
            
            @Override
            public TryEnterHomeReq build() {
                final TryEnterHomeReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public TryEnterHomeReq buildPartial() {
                final TryEnterHomeReq result = new TryEnterHomeReq(this);
                result.targetUid_ = this.targetUid_;
                result.targetPoint_ = this.targetPoint_;
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
                if (other instanceof TryEnterHomeReq) {
                    return this.mergeFrom((TryEnterHomeReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final TryEnterHomeReq other) {
                if (other == TryEnterHomeReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getTargetUid() != 0) {
                    this.setTargetUid(other.getTargetUid());
                }
                if (other.getTargetPoint() != 0) {
                    this.setTargetPoint(other.getTargetPoint());
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
                TryEnterHomeReq parsedMessage = null;
                try {
                    parsedMessage = TryEnterHomeReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (TryEnterHomeReq)e.getUnfinishedMessage();
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
            public int getTargetPoint() {
                return this.targetPoint_;
            }
            
            public Builder setTargetPoint(final int value) {
                this.targetPoint_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTargetPoint() {
                this.targetPoint_ = 0;
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
    
    public interface TryEnterHomeReqOrBuilder extends MessageOrBuilder
    {
        int getTargetUid();
        
        int getTargetPoint();
    }
}
