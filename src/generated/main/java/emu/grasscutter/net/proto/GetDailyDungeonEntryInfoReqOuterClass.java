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

public final class GetDailyDungeonEntryInfoReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_GetDailyDungeonEntryInfoReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GetDailyDungeonEntryInfoReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GetDailyDungeonEntryInfoReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GetDailyDungeonEntryInfoReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n!GetDailyDungeonEntryInfoReq.proto\"/\n\u001bGetDailyDungeonEntryInfoReq\u0012\u0010\n\bscene_id\u0018\u000f \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GetDailyDungeonEntryInfoReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_GetDailyDungeonEntryInfoReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GetDailyDungeonEntryInfoReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GetDailyDungeonEntryInfoReqOuterClass.internal_static_GetDailyDungeonEntryInfoReq_descriptor, new String[] { "SceneId" });
    }
    
    public static final class GetDailyDungeonEntryInfoReq extends GeneratedMessageV3 implements GetDailyDungeonEntryInfoReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SCENE_ID_FIELD_NUMBER = 15;
        private int sceneId_;
        private byte memoizedIsInitialized;
        private static final GetDailyDungeonEntryInfoReq DEFAULT_INSTANCE;
        private static final Parser<GetDailyDungeonEntryInfoReq> PARSER;
        
        private GetDailyDungeonEntryInfoReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private GetDailyDungeonEntryInfoReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GetDailyDungeonEntryInfoReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GetDailyDungeonEntryInfoReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 120: {
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
            return GetDailyDungeonEntryInfoReqOuterClass.internal_static_GetDailyDungeonEntryInfoReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GetDailyDungeonEntryInfoReqOuterClass.internal_static_GetDailyDungeonEntryInfoReq_fieldAccessorTable.ensureFieldAccessorsInitialized(GetDailyDungeonEntryInfoReq.class, Builder.class);
        }
        
        @Override
        public int getSceneId() {
            return this.sceneId_;
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
            if (this.sceneId_ != 0) {
                output.writeUInt32(15, this.sceneId_);
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
            if (this.sceneId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(15, this.sceneId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetDailyDungeonEntryInfoReq)) {
                return super.equals(obj);
            }
            final GetDailyDungeonEntryInfoReq other = (GetDailyDungeonEntryInfoReq)obj;
            return this.getSceneId() == other.getSceneId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getSceneId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GetDailyDungeonEntryInfoReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GetDailyDungeonEntryInfoReq.PARSER.parseFrom(data);
        }
        
        public static GetDailyDungeonEntryInfoReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetDailyDungeonEntryInfoReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetDailyDungeonEntryInfoReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GetDailyDungeonEntryInfoReq.PARSER.parseFrom(data);
        }
        
        public static GetDailyDungeonEntryInfoReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetDailyDungeonEntryInfoReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetDailyDungeonEntryInfoReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GetDailyDungeonEntryInfoReq.PARSER.parseFrom(data);
        }
        
        public static GetDailyDungeonEntryInfoReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetDailyDungeonEntryInfoReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetDailyDungeonEntryInfoReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetDailyDungeonEntryInfoReq.PARSER, input);
        }
        
        public static GetDailyDungeonEntryInfoReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetDailyDungeonEntryInfoReq.PARSER, input, extensionRegistry);
        }
        
        public static GetDailyDungeonEntryInfoReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetDailyDungeonEntryInfoReq.PARSER, input);
        }
        
        public static GetDailyDungeonEntryInfoReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetDailyDungeonEntryInfoReq.PARSER, input, extensionRegistry);
        }
        
        public static GetDailyDungeonEntryInfoReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetDailyDungeonEntryInfoReq.PARSER, input);
        }
        
        public static GetDailyDungeonEntryInfoReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetDailyDungeonEntryInfoReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GetDailyDungeonEntryInfoReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GetDailyDungeonEntryInfoReq prototype) {
            return GetDailyDungeonEntryInfoReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GetDailyDungeonEntryInfoReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GetDailyDungeonEntryInfoReq getDefaultInstance() {
            return GetDailyDungeonEntryInfoReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<GetDailyDungeonEntryInfoReq> parser() {
            return GetDailyDungeonEntryInfoReq.PARSER;
        }
        
        @Override
        public Parser<GetDailyDungeonEntryInfoReq> getParserForType() {
            return GetDailyDungeonEntryInfoReq.PARSER;
        }
        
        @Override
        public GetDailyDungeonEntryInfoReq getDefaultInstanceForType() {
            return GetDailyDungeonEntryInfoReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GetDailyDungeonEntryInfoReq();
            PARSER = new AbstractParser<GetDailyDungeonEntryInfoReq>() {
                @Override
                public GetDailyDungeonEntryInfoReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GetDailyDungeonEntryInfoReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetDailyDungeonEntryInfoReqOrBuilder
        {
            private int sceneId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GetDailyDungeonEntryInfoReqOuterClass.internal_static_GetDailyDungeonEntryInfoReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GetDailyDungeonEntryInfoReqOuterClass.internal_static_GetDailyDungeonEntryInfoReq_fieldAccessorTable.ensureFieldAccessorsInitialized(GetDailyDungeonEntryInfoReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GetDailyDungeonEntryInfoReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.sceneId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GetDailyDungeonEntryInfoReqOuterClass.internal_static_GetDailyDungeonEntryInfoReq_descriptor;
            }
            
            @Override
            public GetDailyDungeonEntryInfoReq getDefaultInstanceForType() {
                return GetDailyDungeonEntryInfoReq.getDefaultInstance();
            }
            
            @Override
            public GetDailyDungeonEntryInfoReq build() {
                final GetDailyDungeonEntryInfoReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GetDailyDungeonEntryInfoReq buildPartial() {
                final GetDailyDungeonEntryInfoReq result = new GetDailyDungeonEntryInfoReq(this);
                result.sceneId_ = this.sceneId_;
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
                if (other instanceof GetDailyDungeonEntryInfoReq) {
                    return this.mergeFrom((GetDailyDungeonEntryInfoReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GetDailyDungeonEntryInfoReq other) {
                if (other == GetDailyDungeonEntryInfoReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getSceneId() != 0) {
                    this.setSceneId(other.getSceneId());
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
                GetDailyDungeonEntryInfoReq parsedMessage = null;
                try {
                    parsedMessage = GetDailyDungeonEntryInfoReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GetDailyDungeonEntryInfoReq)e.getUnfinishedMessage();
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface GetDailyDungeonEntryInfoReqOrBuilder extends MessageOrBuilder
    {
        int getSceneId();
    }
}
