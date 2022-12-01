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

public final class PostEnterSceneReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_PostEnterSceneReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PostEnterSceneReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PostEnterSceneReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PostEnterSceneReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0017PostEnterSceneReq.proto\".\n\u0011PostEnterSceneReq\u0012\u0019\n\u0011enter_scene_token\u0018\u000e \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PostEnterSceneReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_PostEnterSceneReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PostEnterSceneReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PostEnterSceneReqOuterClass.internal_static_PostEnterSceneReq_descriptor, new String[] { "EnterSceneToken" });
    }
    
    public static final class PostEnterSceneReq extends GeneratedMessageV3 implements PostEnterSceneReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ENTER_SCENE_TOKEN_FIELD_NUMBER = 14;
        private int enterSceneToken_;
        private byte memoizedIsInitialized;
        private static final PostEnterSceneReq DEFAULT_INSTANCE;
        private static final Parser<PostEnterSceneReq> PARSER;
        
        private PostEnterSceneReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private PostEnterSceneReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PostEnterSceneReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PostEnterSceneReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 112: {
                            this.enterSceneToken_ = input.readUInt32();
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
            return PostEnterSceneReqOuterClass.internal_static_PostEnterSceneReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PostEnterSceneReqOuterClass.internal_static_PostEnterSceneReq_fieldAccessorTable.ensureFieldAccessorsInitialized(PostEnterSceneReq.class, Builder.class);
        }
        
        @Override
        public int getEnterSceneToken() {
            return this.enterSceneToken_;
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
            if (this.enterSceneToken_ != 0) {
                output.writeUInt32(14, this.enterSceneToken_);
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
            if (this.enterSceneToken_ != 0) {
                size += CodedOutputStream.computeUInt32Size(14, this.enterSceneToken_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PostEnterSceneReq)) {
                return super.equals(obj);
            }
            final PostEnterSceneReq other = (PostEnterSceneReq)obj;
            return this.getEnterSceneToken() == other.getEnterSceneToken() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getEnterSceneToken();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PostEnterSceneReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PostEnterSceneReq.PARSER.parseFrom(data);
        }
        
        public static PostEnterSceneReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PostEnterSceneReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PostEnterSceneReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PostEnterSceneReq.PARSER.parseFrom(data);
        }
        
        public static PostEnterSceneReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PostEnterSceneReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PostEnterSceneReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PostEnterSceneReq.PARSER.parseFrom(data);
        }
        
        public static PostEnterSceneReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PostEnterSceneReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PostEnterSceneReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PostEnterSceneReq.PARSER, input);
        }
        
        public static PostEnterSceneReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PostEnterSceneReq.PARSER, input, extensionRegistry);
        }
        
        public static PostEnterSceneReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PostEnterSceneReq.PARSER, input);
        }
        
        public static PostEnterSceneReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PostEnterSceneReq.PARSER, input, extensionRegistry);
        }
        
        public static PostEnterSceneReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PostEnterSceneReq.PARSER, input);
        }
        
        public static PostEnterSceneReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PostEnterSceneReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PostEnterSceneReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PostEnterSceneReq prototype) {
            return PostEnterSceneReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PostEnterSceneReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PostEnterSceneReq getDefaultInstance() {
            return PostEnterSceneReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<PostEnterSceneReq> parser() {
            return PostEnterSceneReq.PARSER;
        }
        
        @Override
        public Parser<PostEnterSceneReq> getParserForType() {
            return PostEnterSceneReq.PARSER;
        }
        
        @Override
        public PostEnterSceneReq getDefaultInstanceForType() {
            return PostEnterSceneReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PostEnterSceneReq();
            PARSER = new AbstractParser<PostEnterSceneReq>() {
                @Override
                public PostEnterSceneReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PostEnterSceneReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PostEnterSceneReqOrBuilder
        {
            private int enterSceneToken_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PostEnterSceneReqOuterClass.internal_static_PostEnterSceneReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PostEnterSceneReqOuterClass.internal_static_PostEnterSceneReq_fieldAccessorTable.ensureFieldAccessorsInitialized(PostEnterSceneReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PostEnterSceneReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.enterSceneToken_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PostEnterSceneReqOuterClass.internal_static_PostEnterSceneReq_descriptor;
            }
            
            @Override
            public PostEnterSceneReq getDefaultInstanceForType() {
                return PostEnterSceneReq.getDefaultInstance();
            }
            
            @Override
            public PostEnterSceneReq build() {
                final PostEnterSceneReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PostEnterSceneReq buildPartial() {
                final PostEnterSceneReq result = new PostEnterSceneReq(this);
                result.enterSceneToken_ = this.enterSceneToken_;
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
                if (other instanceof PostEnterSceneReq) {
                    return this.mergeFrom((PostEnterSceneReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PostEnterSceneReq other) {
                if (other == PostEnterSceneReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getEnterSceneToken() != 0) {
                    this.setEnterSceneToken(other.getEnterSceneToken());
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
                PostEnterSceneReq parsedMessage = null;
                try {
                    parsedMessage = PostEnterSceneReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PostEnterSceneReq)e.getUnfinishedMessage();
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
            public int getEnterSceneToken() {
                return this.enterSceneToken_;
            }
            
            public Builder setEnterSceneToken(final int value) {
                this.enterSceneToken_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEnterSceneToken() {
                this.enterSceneToken_ = 0;
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
    
    public interface PostEnterSceneReqOrBuilder extends MessageOrBuilder
    {
        int getEnterSceneToken();
    }
}