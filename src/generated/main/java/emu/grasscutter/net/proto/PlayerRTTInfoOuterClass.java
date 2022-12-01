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

public final class PlayerRTTInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_PlayerRTTInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PlayerRTTInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PlayerRTTInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PlayerRTTInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0013PlayerRTTInfo.proto\")\n\rPlayerRTTInfo\u0012\u000b\n\u0003rtt\u0018\u0002 \u0001(\r\u0012\u000b\n\u0003uid\u0018\u0001 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PlayerRTTInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_PlayerRTTInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PlayerRTTInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PlayerRTTInfoOuterClass.internal_static_PlayerRTTInfo_descriptor, new String[] { "Rtt", "Uid" });
    }
    
    public static final class PlayerRTTInfo extends GeneratedMessageV3 implements PlayerRTTInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RTT_FIELD_NUMBER = 2;
        private int rtt_;
        public static final int UID_FIELD_NUMBER = 1;
        private int uid_;
        private byte memoizedIsInitialized;
        private static final PlayerRTTInfo DEFAULT_INSTANCE;
        private static final Parser<PlayerRTTInfo> PARSER;
        
        private PlayerRTTInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private PlayerRTTInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PlayerRTTInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PlayerRTTInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.uid_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.rtt_ = input.readUInt32();
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
            return PlayerRTTInfoOuterClass.internal_static_PlayerRTTInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PlayerRTTInfoOuterClass.internal_static_PlayerRTTInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerRTTInfo.class, Builder.class);
        }
        
        @Override
        public int getRtt() {
            return this.rtt_;
        }
        
        @Override
        public int getUid() {
            return this.uid_;
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
            if (this.uid_ != 0) {
                output.writeUInt32(1, this.uid_);
            }
            if (this.rtt_ != 0) {
                output.writeUInt32(2, this.rtt_);
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
            if (this.uid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.uid_);
            }
            if (this.rtt_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.rtt_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayerRTTInfo)) {
                return super.equals(obj);
            }
            final PlayerRTTInfo other = (PlayerRTTInfo)obj;
            return this.getRtt() == other.getRtt() && this.getUid() == other.getUid() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getRtt();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getUid();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PlayerRTTInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PlayerRTTInfo.PARSER.parseFrom(data);
        }
        
        public static PlayerRTTInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerRTTInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerRTTInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PlayerRTTInfo.PARSER.parseFrom(data);
        }
        
        public static PlayerRTTInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerRTTInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerRTTInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PlayerRTTInfo.PARSER.parseFrom(data);
        }
        
        public static PlayerRTTInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerRTTInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerRTTInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerRTTInfo.PARSER, input);
        }
        
        public static PlayerRTTInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerRTTInfo.PARSER, input, extensionRegistry);
        }
        
        public static PlayerRTTInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerRTTInfo.PARSER, input);
        }
        
        public static PlayerRTTInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerRTTInfo.PARSER, input, extensionRegistry);
        }
        
        public static PlayerRTTInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerRTTInfo.PARSER, input);
        }
        
        public static PlayerRTTInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerRTTInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PlayerRTTInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PlayerRTTInfo prototype) {
            return PlayerRTTInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PlayerRTTInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PlayerRTTInfo getDefaultInstance() {
            return PlayerRTTInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<PlayerRTTInfo> parser() {
            return PlayerRTTInfo.PARSER;
        }
        
        @Override
        public Parser<PlayerRTTInfo> getParserForType() {
            return PlayerRTTInfo.PARSER;
        }
        
        @Override
        public PlayerRTTInfo getDefaultInstanceForType() {
            return PlayerRTTInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PlayerRTTInfo();
            PARSER = new AbstractParser<PlayerRTTInfo>() {
                @Override
                public PlayerRTTInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PlayerRTTInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlayerRTTInfoOrBuilder
        {
            private int rtt_;
            private int uid_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PlayerRTTInfoOuterClass.internal_static_PlayerRTTInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PlayerRTTInfoOuterClass.internal_static_PlayerRTTInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerRTTInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PlayerRTTInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.rtt_ = 0;
                this.uid_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PlayerRTTInfoOuterClass.internal_static_PlayerRTTInfo_descriptor;
            }
            
            @Override
            public PlayerRTTInfo getDefaultInstanceForType() {
                return PlayerRTTInfo.getDefaultInstance();
            }
            
            @Override
            public PlayerRTTInfo build() {
                final PlayerRTTInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PlayerRTTInfo buildPartial() {
                final PlayerRTTInfo result = new PlayerRTTInfo(this);
                result.rtt_ = this.rtt_;
                result.uid_ = this.uid_;
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
                if (other instanceof PlayerRTTInfo) {
                    return this.mergeFrom((PlayerRTTInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PlayerRTTInfo other) {
                if (other == PlayerRTTInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getRtt() != 0) {
                    this.setRtt(other.getRtt());
                }
                if (other.getUid() != 0) {
                    this.setUid(other.getUid());
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
                PlayerRTTInfo parsedMessage = null;
                try {
                    parsedMessage = PlayerRTTInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PlayerRTTInfo)e.getUnfinishedMessage();
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
            public int getRtt() {
                return this.rtt_;
            }
            
            public Builder setRtt(final int value) {
                this.rtt_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRtt() {
                this.rtt_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUid() {
                return this.uid_;
            }
            
            public Builder setUid(final int value) {
                this.uid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUid() {
                this.uid_ = 0;
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
    
    public interface PlayerRTTInfoOrBuilder extends MessageOrBuilder
    {
        int getRtt();
        
        int getUid();
    }
}
