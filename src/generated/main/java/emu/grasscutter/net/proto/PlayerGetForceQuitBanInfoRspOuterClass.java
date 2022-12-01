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

public final class PlayerGetForceQuitBanInfoRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_PlayerGetForceQuitBanInfoRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PlayerGetForceQuitBanInfoRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PlayerGetForceQuitBanInfoRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PlayerGetForceQuitBanInfoRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\"PlayerGetForceQuitBanInfoRsp.proto\"V\n\u001cPlayerGetForceQuitBanInfoRsp\u0012\u000f\n\u0007retcode\u0018\u0004 \u0001(\u0005\u0012\u0010\n\bmatch_id\u0018\b \u0001(\r\u0012\u0013\n\u000bexpire_time\u0018\r \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PlayerGetForceQuitBanInfoRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_PlayerGetForceQuitBanInfoRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PlayerGetForceQuitBanInfoRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PlayerGetForceQuitBanInfoRspOuterClass.internal_static_PlayerGetForceQuitBanInfoRsp_descriptor, new String[] { "Retcode", "MatchId", "ExpireTime" });
    }
    
    public static final class PlayerGetForceQuitBanInfoRsp extends GeneratedMessageV3 implements PlayerGetForceQuitBanInfoRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RETCODE_FIELD_NUMBER = 4;
        private int retcode_;
        public static final int MATCH_ID_FIELD_NUMBER = 8;
        private int matchId_;
        public static final int EXPIRE_TIME_FIELD_NUMBER = 13;
        private int expireTime_;
        private byte memoizedIsInitialized;
        private static final PlayerGetForceQuitBanInfoRsp DEFAULT_INSTANCE;
        private static final Parser<PlayerGetForceQuitBanInfoRsp> PARSER;
        
        private PlayerGetForceQuitBanInfoRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private PlayerGetForceQuitBanInfoRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PlayerGetForceQuitBanInfoRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PlayerGetForceQuitBanInfoRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 64: {
                            this.matchId_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            this.expireTime_ = input.readUInt32();
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
            return PlayerGetForceQuitBanInfoRspOuterClass.internal_static_PlayerGetForceQuitBanInfoRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PlayerGetForceQuitBanInfoRspOuterClass.internal_static_PlayerGetForceQuitBanInfoRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerGetForceQuitBanInfoRsp.class, Builder.class);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public int getMatchId() {
            return this.matchId_;
        }
        
        @Override
        public int getExpireTime() {
            return this.expireTime_;
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
            if (this.retcode_ != 0) {
                output.writeInt32(4, this.retcode_);
            }
            if (this.matchId_ != 0) {
                output.writeUInt32(8, this.matchId_);
            }
            if (this.expireTime_ != 0) {
                output.writeUInt32(13, this.expireTime_);
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
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(4, this.retcode_);
            }
            if (this.matchId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.matchId_);
            }
            if (this.expireTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.expireTime_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayerGetForceQuitBanInfoRsp)) {
                return super.equals(obj);
            }
            final PlayerGetForceQuitBanInfoRsp other = (PlayerGetForceQuitBanInfoRsp)obj;
            return this.getRetcode() == other.getRetcode() && this.getMatchId() == other.getMatchId() && this.getExpireTime() == other.getExpireTime() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getMatchId();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getExpireTime();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PlayerGetForceQuitBanInfoRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PlayerGetForceQuitBanInfoRsp.PARSER.parseFrom(data);
        }
        
        public static PlayerGetForceQuitBanInfoRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerGetForceQuitBanInfoRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerGetForceQuitBanInfoRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PlayerGetForceQuitBanInfoRsp.PARSER.parseFrom(data);
        }
        
        public static PlayerGetForceQuitBanInfoRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerGetForceQuitBanInfoRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerGetForceQuitBanInfoRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PlayerGetForceQuitBanInfoRsp.PARSER.parseFrom(data);
        }
        
        public static PlayerGetForceQuitBanInfoRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerGetForceQuitBanInfoRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerGetForceQuitBanInfoRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerGetForceQuitBanInfoRsp.PARSER, input);
        }
        
        public static PlayerGetForceQuitBanInfoRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerGetForceQuitBanInfoRsp.PARSER, input, extensionRegistry);
        }
        
        public static PlayerGetForceQuitBanInfoRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerGetForceQuitBanInfoRsp.PARSER, input);
        }
        
        public static PlayerGetForceQuitBanInfoRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerGetForceQuitBanInfoRsp.PARSER, input, extensionRegistry);
        }
        
        public static PlayerGetForceQuitBanInfoRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerGetForceQuitBanInfoRsp.PARSER, input);
        }
        
        public static PlayerGetForceQuitBanInfoRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerGetForceQuitBanInfoRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PlayerGetForceQuitBanInfoRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PlayerGetForceQuitBanInfoRsp prototype) {
            return PlayerGetForceQuitBanInfoRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PlayerGetForceQuitBanInfoRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PlayerGetForceQuitBanInfoRsp getDefaultInstance() {
            return PlayerGetForceQuitBanInfoRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<PlayerGetForceQuitBanInfoRsp> parser() {
            return PlayerGetForceQuitBanInfoRsp.PARSER;
        }
        
        @Override
        public Parser<PlayerGetForceQuitBanInfoRsp> getParserForType() {
            return PlayerGetForceQuitBanInfoRsp.PARSER;
        }
        
        @Override
        public PlayerGetForceQuitBanInfoRsp getDefaultInstanceForType() {
            return PlayerGetForceQuitBanInfoRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PlayerGetForceQuitBanInfoRsp();
            PARSER = new AbstractParser<PlayerGetForceQuitBanInfoRsp>() {
                @Override
                public PlayerGetForceQuitBanInfoRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PlayerGetForceQuitBanInfoRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlayerGetForceQuitBanInfoRspOrBuilder
        {
            private int retcode_;
            private int matchId_;
            private int expireTime_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PlayerGetForceQuitBanInfoRspOuterClass.internal_static_PlayerGetForceQuitBanInfoRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PlayerGetForceQuitBanInfoRspOuterClass.internal_static_PlayerGetForceQuitBanInfoRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerGetForceQuitBanInfoRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PlayerGetForceQuitBanInfoRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                this.matchId_ = 0;
                this.expireTime_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PlayerGetForceQuitBanInfoRspOuterClass.internal_static_PlayerGetForceQuitBanInfoRsp_descriptor;
            }
            
            @Override
            public PlayerGetForceQuitBanInfoRsp getDefaultInstanceForType() {
                return PlayerGetForceQuitBanInfoRsp.getDefaultInstance();
            }
            
            @Override
            public PlayerGetForceQuitBanInfoRsp build() {
                final PlayerGetForceQuitBanInfoRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PlayerGetForceQuitBanInfoRsp buildPartial() {
                final PlayerGetForceQuitBanInfoRsp result = new PlayerGetForceQuitBanInfoRsp(this);
                result.retcode_ = this.retcode_;
                result.matchId_ = this.matchId_;
                result.expireTime_ = this.expireTime_;
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
                if (other instanceof PlayerGetForceQuitBanInfoRsp) {
                    return this.mergeFrom((PlayerGetForceQuitBanInfoRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PlayerGetForceQuitBanInfoRsp other) {
                if (other == PlayerGetForceQuitBanInfoRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (other.getMatchId() != 0) {
                    this.setMatchId(other.getMatchId());
                }
                if (other.getExpireTime() != 0) {
                    this.setExpireTime(other.getExpireTime());
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
                PlayerGetForceQuitBanInfoRsp parsedMessage = null;
                try {
                    parsedMessage = PlayerGetForceQuitBanInfoRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PlayerGetForceQuitBanInfoRsp)e.getUnfinishedMessage();
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
            public int getRetcode() {
                return this.retcode_;
            }
            
            public Builder setRetcode(final int value) {
                this.retcode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRetcode() {
                this.retcode_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getMatchId() {
                return this.matchId_;
            }
            
            public Builder setMatchId(final int value) {
                this.matchId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMatchId() {
                this.matchId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getExpireTime() {
                return this.expireTime_;
            }
            
            public Builder setExpireTime(final int value) {
                this.expireTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearExpireTime() {
                this.expireTime_ = 0;
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
    
    public interface PlayerGetForceQuitBanInfoRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
        
        int getMatchId();
        
        int getExpireTime();
    }
}
