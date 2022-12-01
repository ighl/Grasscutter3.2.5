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

public final class SceneKickPlayerReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_SceneKickPlayerReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SceneKickPlayerReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SceneKickPlayerReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SceneKickPlayerReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018SceneKickPlayerReq.proto\"(\n\u0012SceneKickPlayerReq\u0012\u0012\n\ntarget_uid\u0018\u0006 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SceneKickPlayerReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_SceneKickPlayerReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SceneKickPlayerReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SceneKickPlayerReqOuterClass.internal_static_SceneKickPlayerReq_descriptor, new String[] { "TargetUid" });
    }
    
    public static final class SceneKickPlayerReq extends GeneratedMessageV3 implements SceneKickPlayerReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int TARGET_UID_FIELD_NUMBER = 6;
        private int targetUid_;
        private byte memoizedIsInitialized;
        private static final SceneKickPlayerReq DEFAULT_INSTANCE;
        private static final Parser<SceneKickPlayerReq> PARSER;
        
        private SceneKickPlayerReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private SceneKickPlayerReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SceneKickPlayerReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SceneKickPlayerReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 48: {
                            this.targetUid_ = input.readUInt32();
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
            return SceneKickPlayerReqOuterClass.internal_static_SceneKickPlayerReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SceneKickPlayerReqOuterClass.internal_static_SceneKickPlayerReq_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneKickPlayerReq.class, Builder.class);
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
                output.writeUInt32(6, this.targetUid_);
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
                size += CodedOutputStream.computeUInt32Size(6, this.targetUid_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SceneKickPlayerReq)) {
                return super.equals(obj);
            }
            final SceneKickPlayerReq other = (SceneKickPlayerReq)obj;
            return this.getTargetUid() == other.getTargetUid() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getTargetUid();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SceneKickPlayerReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SceneKickPlayerReq.PARSER.parseFrom(data);
        }
        
        public static SceneKickPlayerReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneKickPlayerReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneKickPlayerReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SceneKickPlayerReq.PARSER.parseFrom(data);
        }
        
        public static SceneKickPlayerReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneKickPlayerReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneKickPlayerReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SceneKickPlayerReq.PARSER.parseFrom(data);
        }
        
        public static SceneKickPlayerReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneKickPlayerReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneKickPlayerReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneKickPlayerReq.PARSER, input);
        }
        
        public static SceneKickPlayerReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneKickPlayerReq.PARSER, input, extensionRegistry);
        }
        
        public static SceneKickPlayerReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneKickPlayerReq.PARSER, input);
        }
        
        public static SceneKickPlayerReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneKickPlayerReq.PARSER, input, extensionRegistry);
        }
        
        public static SceneKickPlayerReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneKickPlayerReq.PARSER, input);
        }
        
        public static SceneKickPlayerReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneKickPlayerReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SceneKickPlayerReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SceneKickPlayerReq prototype) {
            return SceneKickPlayerReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SceneKickPlayerReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SceneKickPlayerReq getDefaultInstance() {
            return SceneKickPlayerReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<SceneKickPlayerReq> parser() {
            return SceneKickPlayerReq.PARSER;
        }
        
        @Override
        public Parser<SceneKickPlayerReq> getParserForType() {
            return SceneKickPlayerReq.PARSER;
        }
        
        @Override
        public SceneKickPlayerReq getDefaultInstanceForType() {
            return SceneKickPlayerReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SceneKickPlayerReq();
            PARSER = new AbstractParser<SceneKickPlayerReq>() {
                @Override
                public SceneKickPlayerReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SceneKickPlayerReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SceneKickPlayerReqOrBuilder
        {
            private int targetUid_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SceneKickPlayerReqOuterClass.internal_static_SceneKickPlayerReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SceneKickPlayerReqOuterClass.internal_static_SceneKickPlayerReq_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneKickPlayerReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SceneKickPlayerReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.targetUid_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SceneKickPlayerReqOuterClass.internal_static_SceneKickPlayerReq_descriptor;
            }
            
            @Override
            public SceneKickPlayerReq getDefaultInstanceForType() {
                return SceneKickPlayerReq.getDefaultInstance();
            }
            
            @Override
            public SceneKickPlayerReq build() {
                final SceneKickPlayerReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SceneKickPlayerReq buildPartial() {
                final SceneKickPlayerReq result = new SceneKickPlayerReq(this);
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
                if (other instanceof SceneKickPlayerReq) {
                    return this.mergeFrom((SceneKickPlayerReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SceneKickPlayerReq other) {
                if (other == SceneKickPlayerReq.getDefaultInstance()) {
                    return this;
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
                SceneKickPlayerReq parsedMessage = null;
                try {
                    parsedMessage = SceneKickPlayerReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SceneKickPlayerReq)e.getUnfinishedMessage();
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface SceneKickPlayerReqOrBuilder extends MessageOrBuilder
    {
        int getTargetUid();
    }
}
