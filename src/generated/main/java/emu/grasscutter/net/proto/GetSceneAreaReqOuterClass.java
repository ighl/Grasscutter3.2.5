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

public final class GetSceneAreaReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_GetSceneAreaReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GetSceneAreaReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GetSceneAreaReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GetSceneAreaReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0015GetSceneAreaReq.proto\"7\n\u000fGetSceneAreaReq\u0012\u0010\n\bscene_id\u0018\b \u0001(\r\u0012\u0012\n\nbelong_uid\u0018\u0004 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GetSceneAreaReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_GetSceneAreaReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GetSceneAreaReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GetSceneAreaReqOuterClass.internal_static_GetSceneAreaReq_descriptor, new String[] { "SceneId", "BelongUid" });
    }
    
    public static final class GetSceneAreaReq extends GeneratedMessageV3 implements GetSceneAreaReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SCENE_ID_FIELD_NUMBER = 8;
        private int sceneId_;
        public static final int BELONG_UID_FIELD_NUMBER = 4;
        private int belongUid_;
        private byte memoizedIsInitialized;
        private static final GetSceneAreaReq DEFAULT_INSTANCE;
        private static final Parser<GetSceneAreaReq> PARSER;
        
        private GetSceneAreaReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private GetSceneAreaReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GetSceneAreaReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GetSceneAreaReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 32: {
                            this.belongUid_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
                            this.sceneId_ = input.readUInt32();
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
            return GetSceneAreaReqOuterClass.internal_static_GetSceneAreaReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GetSceneAreaReqOuterClass.internal_static_GetSceneAreaReq_fieldAccessorTable.ensureFieldAccessorsInitialized(GetSceneAreaReq.class, Builder.class);
        }
        
        @Override
        public int getSceneId() {
            return this.sceneId_;
        }
        
        @Override
        public int getBelongUid() {
            return this.belongUid_;
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
            if (this.belongUid_ != 0) {
                output.writeUInt32(4, this.belongUid_);
            }
            if (this.sceneId_ != 0) {
                output.writeUInt32(8, this.sceneId_);
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
            if (this.belongUid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.belongUid_);
            }
            if (this.sceneId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.sceneId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetSceneAreaReq)) {
                return super.equals(obj);
            }
            final GetSceneAreaReq other = (GetSceneAreaReq)obj;
            return this.getSceneId() == other.getSceneId() && this.getBelongUid() == other.getBelongUid() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getSceneId();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getBelongUid();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GetSceneAreaReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GetSceneAreaReq.PARSER.parseFrom(data);
        }
        
        public static GetSceneAreaReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetSceneAreaReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetSceneAreaReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GetSceneAreaReq.PARSER.parseFrom(data);
        }
        
        public static GetSceneAreaReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetSceneAreaReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetSceneAreaReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GetSceneAreaReq.PARSER.parseFrom(data);
        }
        
        public static GetSceneAreaReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetSceneAreaReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetSceneAreaReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetSceneAreaReq.PARSER, input);
        }
        
        public static GetSceneAreaReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetSceneAreaReq.PARSER, input, extensionRegistry);
        }
        
        public static GetSceneAreaReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetSceneAreaReq.PARSER, input);
        }
        
        public static GetSceneAreaReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetSceneAreaReq.PARSER, input, extensionRegistry);
        }
        
        public static GetSceneAreaReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetSceneAreaReq.PARSER, input);
        }
        
        public static GetSceneAreaReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetSceneAreaReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GetSceneAreaReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GetSceneAreaReq prototype) {
            return GetSceneAreaReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GetSceneAreaReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GetSceneAreaReq getDefaultInstance() {
            return GetSceneAreaReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<GetSceneAreaReq> parser() {
            return GetSceneAreaReq.PARSER;
        }
        
        @Override
        public Parser<GetSceneAreaReq> getParserForType() {
            return GetSceneAreaReq.PARSER;
        }
        
        @Override
        public GetSceneAreaReq getDefaultInstanceForType() {
            return GetSceneAreaReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GetSceneAreaReq();
            PARSER = new AbstractParser<GetSceneAreaReq>() {
                @Override
                public GetSceneAreaReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GetSceneAreaReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetSceneAreaReqOrBuilder
        {
            private int sceneId_;
            private int belongUid_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GetSceneAreaReqOuterClass.internal_static_GetSceneAreaReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GetSceneAreaReqOuterClass.internal_static_GetSceneAreaReq_fieldAccessorTable.ensureFieldAccessorsInitialized(GetSceneAreaReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GetSceneAreaReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.sceneId_ = 0;
                this.belongUid_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GetSceneAreaReqOuterClass.internal_static_GetSceneAreaReq_descriptor;
            }
            
            @Override
            public GetSceneAreaReq getDefaultInstanceForType() {
                return GetSceneAreaReq.getDefaultInstance();
            }
            
            @Override
            public GetSceneAreaReq build() {
                final GetSceneAreaReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GetSceneAreaReq buildPartial() {
                final GetSceneAreaReq result = new GetSceneAreaReq(this);
                result.sceneId_ = this.sceneId_;
                result.belongUid_ = this.belongUid_;
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
                if (other instanceof GetSceneAreaReq) {
                    return this.mergeFrom((GetSceneAreaReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GetSceneAreaReq other) {
                if (other == GetSceneAreaReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getSceneId() != 0) {
                    this.setSceneId(other.getSceneId());
                }
                if (other.getBelongUid() != 0) {
                    this.setBelongUid(other.getBelongUid());
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
                GetSceneAreaReq parsedMessage = null;
                try {
                    parsedMessage = GetSceneAreaReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GetSceneAreaReq)e.getUnfinishedMessage();
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
            public int getSceneId() {
                return this.sceneId_;
            }
            
            public Builder setSceneId(final int value) {
                this.sceneId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSceneId() {
                this.sceneId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getBelongUid() {
                return this.belongUid_;
            }
            
            public Builder setBelongUid(final int value) {
                this.belongUid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearBelongUid() {
                this.belongUid_ = 0;
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
    
    public interface GetSceneAreaReqOrBuilder extends MessageOrBuilder
    {
        int getSceneId();
        
        int getBelongUid();
    }
}
