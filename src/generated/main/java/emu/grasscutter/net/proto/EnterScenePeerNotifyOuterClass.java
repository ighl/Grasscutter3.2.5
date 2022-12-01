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

public final class EnterScenePeerNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_EnterScenePeerNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EnterScenePeerNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private EnterScenePeerNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return EnterScenePeerNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001aEnterScenePeerNotify.proto\"o\n\u0014EnterScenePeerNotify\u0012\u0015\n\rdest_scene_id\u0018\n \u0001(\r\u0012\u0019\n\u0011enter_scene_token\u0018\b \u0001(\r\u0012\u0014\n\fhost_peer_id\u0018\u0007 \u0001(\r\u0012\u000f\n\u0007peer_id\u0018\u000b \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        EnterScenePeerNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_EnterScenePeerNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_EnterScenePeerNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(EnterScenePeerNotifyOuterClass.internal_static_EnterScenePeerNotify_descriptor, new String[] { "DestSceneId", "EnterSceneToken", "HostPeerId", "PeerId" });
    }
    
    public static final class EnterScenePeerNotify extends GeneratedMessageV3 implements EnterScenePeerNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int DEST_SCENE_ID_FIELD_NUMBER = 10;
        private int destSceneId_;
        public static final int ENTER_SCENE_TOKEN_FIELD_NUMBER = 8;
        private int enterSceneToken_;
        public static final int HOST_PEER_ID_FIELD_NUMBER = 7;
        private int hostPeerId_;
        public static final int PEER_ID_FIELD_NUMBER = 11;
        private int peerId_;
        private byte memoizedIsInitialized;
        private static final EnterScenePeerNotify DEFAULT_INSTANCE;
        private static final Parser<EnterScenePeerNotify> PARSER;
        
        private EnterScenePeerNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private EnterScenePeerNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new EnterScenePeerNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private EnterScenePeerNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 56: {
                            this.hostPeerId_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
                            this.enterSceneToken_ = input.readUInt32();
                            continue;
                        }
                        case 80: {
                            this.destSceneId_ = input.readUInt32();
                            continue;
                        }
                        case 88: {
                            this.peerId_ = input.readUInt32();
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
            return EnterScenePeerNotifyOuterClass.internal_static_EnterScenePeerNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return EnterScenePeerNotifyOuterClass.internal_static_EnterScenePeerNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(EnterScenePeerNotify.class, Builder.class);
        }
        
        @Override
        public int getDestSceneId() {
            return this.destSceneId_;
        }
        
        @Override
        public int getEnterSceneToken() {
            return this.enterSceneToken_;
        }
        
        @Override
        public int getHostPeerId() {
            return this.hostPeerId_;
        }
        
        @Override
        public int getPeerId() {
            return this.peerId_;
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
            if (this.hostPeerId_ != 0) {
                output.writeUInt32(7, this.hostPeerId_);
            }
            if (this.enterSceneToken_ != 0) {
                output.writeUInt32(8, this.enterSceneToken_);
            }
            if (this.destSceneId_ != 0) {
                output.writeUInt32(10, this.destSceneId_);
            }
            if (this.peerId_ != 0) {
                output.writeUInt32(11, this.peerId_);
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
            if (this.hostPeerId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.hostPeerId_);
            }
            if (this.enterSceneToken_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.enterSceneToken_);
            }
            if (this.destSceneId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.destSceneId_);
            }
            if (this.peerId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.peerId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EnterScenePeerNotify)) {
                return super.equals(obj);
            }
            final EnterScenePeerNotify other = (EnterScenePeerNotify)obj;
            return this.getDestSceneId() == other.getDestSceneId() && this.getEnterSceneToken() == other.getEnterSceneToken() && this.getHostPeerId() == other.getHostPeerId() && this.getPeerId() == other.getPeerId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getDestSceneId();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getEnterSceneToken();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getHostPeerId();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getPeerId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static EnterScenePeerNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return EnterScenePeerNotify.PARSER.parseFrom(data);
        }
        
        public static EnterScenePeerNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EnterScenePeerNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EnterScenePeerNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return EnterScenePeerNotify.PARSER.parseFrom(data);
        }
        
        public static EnterScenePeerNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EnterScenePeerNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EnterScenePeerNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return EnterScenePeerNotify.PARSER.parseFrom(data);
        }
        
        public static EnterScenePeerNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EnterScenePeerNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EnterScenePeerNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EnterScenePeerNotify.PARSER, input);
        }
        
        public static EnterScenePeerNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EnterScenePeerNotify.PARSER, input, extensionRegistry);
        }
        
        public static EnterScenePeerNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EnterScenePeerNotify.PARSER, input);
        }
        
        public static EnterScenePeerNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EnterScenePeerNotify.PARSER, input, extensionRegistry);
        }
        
        public static EnterScenePeerNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EnterScenePeerNotify.PARSER, input);
        }
        
        public static EnterScenePeerNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EnterScenePeerNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return EnterScenePeerNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final EnterScenePeerNotify prototype) {
            return EnterScenePeerNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == EnterScenePeerNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static EnterScenePeerNotify getDefaultInstance() {
            return EnterScenePeerNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<EnterScenePeerNotify> parser() {
            return EnterScenePeerNotify.PARSER;
        }
        
        @Override
        public Parser<EnterScenePeerNotify> getParserForType() {
            return EnterScenePeerNotify.PARSER;
        }
        
        @Override
        public EnterScenePeerNotify getDefaultInstanceForType() {
            return EnterScenePeerNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new EnterScenePeerNotify();
            PARSER = new AbstractParser<EnterScenePeerNotify>() {
                @Override
                public EnterScenePeerNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new EnterScenePeerNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EnterScenePeerNotifyOrBuilder
        {
            private int destSceneId_;
            private int enterSceneToken_;
            private int hostPeerId_;
            private int peerId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return EnterScenePeerNotifyOuterClass.internal_static_EnterScenePeerNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return EnterScenePeerNotifyOuterClass.internal_static_EnterScenePeerNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(EnterScenePeerNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (EnterScenePeerNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.destSceneId_ = 0;
                this.enterSceneToken_ = 0;
                this.hostPeerId_ = 0;
                this.peerId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return EnterScenePeerNotifyOuterClass.internal_static_EnterScenePeerNotify_descriptor;
            }
            
            @Override
            public EnterScenePeerNotify getDefaultInstanceForType() {
                return EnterScenePeerNotify.getDefaultInstance();
            }
            
            @Override
            public EnterScenePeerNotify build() {
                final EnterScenePeerNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public EnterScenePeerNotify buildPartial() {
                final EnterScenePeerNotify result = new EnterScenePeerNotify(this);
                result.destSceneId_ = this.destSceneId_;
                result.enterSceneToken_ = this.enterSceneToken_;
                result.hostPeerId_ = this.hostPeerId_;
                result.peerId_ = this.peerId_;
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
                if (other instanceof EnterScenePeerNotify) {
                    return this.mergeFrom((EnterScenePeerNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final EnterScenePeerNotify other) {
                if (other == EnterScenePeerNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getDestSceneId() != 0) {
                    this.setDestSceneId(other.getDestSceneId());
                }
                if (other.getEnterSceneToken() != 0) {
                    this.setEnterSceneToken(other.getEnterSceneToken());
                }
                if (other.getHostPeerId() != 0) {
                    this.setHostPeerId(other.getHostPeerId());
                }
                if (other.getPeerId() != 0) {
                    this.setPeerId(other.getPeerId());
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
                EnterScenePeerNotify parsedMessage = null;
                try {
                    parsedMessage = EnterScenePeerNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (EnterScenePeerNotify)e.getUnfinishedMessage();
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
            public int getDestSceneId() {
                return this.destSceneId_;
            }
            
            public Builder setDestSceneId(final int value) {
                this.destSceneId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearDestSceneId() {
                this.destSceneId_ = 0;
                this.onChanged();
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
            public int getHostPeerId() {
                return this.hostPeerId_;
            }
            
            public Builder setHostPeerId(final int value) {
                this.hostPeerId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearHostPeerId() {
                this.hostPeerId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getPeerId() {
                return this.peerId_;
            }
            
            public Builder setPeerId(final int value) {
                this.peerId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPeerId() {
                this.peerId_ = 0;
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
    
    public interface EnterScenePeerNotifyOrBuilder extends MessageOrBuilder
    {
        int getDestSceneId();
        
        int getEnterSceneToken();
        
        int getHostPeerId();
        
        int getPeerId();
    }
}
