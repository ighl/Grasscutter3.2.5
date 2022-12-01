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
import com.google.protobuf.Internal;
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

public final class PlayerTimeNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_PlayerTimeNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PlayerTimeNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PlayerTimeNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PlayerTimeNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016PlayerTimeNotify.proto\"O\n\u0010PlayerTimeNotify\u0012\u0013\n\u000bserver_time\u0018\u0005 \u0001(\u0004\u0012\u0013\n\u000bplayer_time\u0018\u000b \u0001(\u0004\u0012\u0011\n\tis_paused\u0018\u000e \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PlayerTimeNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_PlayerTimeNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PlayerTimeNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PlayerTimeNotifyOuterClass.internal_static_PlayerTimeNotify_descriptor, new String[] { "ServerTime", "PlayerTime", "IsPaused" });
    }
    
    public static final class PlayerTimeNotify extends GeneratedMessageV3 implements PlayerTimeNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SERVER_TIME_FIELD_NUMBER = 5;
        private long serverTime_;
        public static final int PLAYER_TIME_FIELD_NUMBER = 11;
        private long playerTime_;
        public static final int IS_PAUSED_FIELD_NUMBER = 14;
        private boolean isPaused_;
        private byte memoizedIsInitialized;
        private static final PlayerTimeNotify DEFAULT_INSTANCE;
        private static final Parser<PlayerTimeNotify> PARSER;
        
        private PlayerTimeNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private PlayerTimeNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PlayerTimeNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PlayerTimeNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 40: {
                            this.serverTime_ = input.readUInt64();
                            continue;
                        }
                        case 88: {
                            this.playerTime_ = input.readUInt64();
                            continue;
                        }
                        case 112: {
                            this.isPaused_ = input.readBool();
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
            return PlayerTimeNotifyOuterClass.internal_static_PlayerTimeNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PlayerTimeNotifyOuterClass.internal_static_PlayerTimeNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerTimeNotify.class, Builder.class);
        }
        
        @Override
        public long getServerTime() {
            return this.serverTime_;
        }
        
        @Override
        public long getPlayerTime() {
            return this.playerTime_;
        }
        
        @Override
        public boolean getIsPaused() {
            return this.isPaused_;
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
            if (this.serverTime_ != 0L) {
                output.writeUInt64(5, this.serverTime_);
            }
            if (this.playerTime_ != 0L) {
                output.writeUInt64(11, this.playerTime_);
            }
            if (this.isPaused_) {
                output.writeBool(14, this.isPaused_);
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
            if (this.serverTime_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(5, this.serverTime_);
            }
            if (this.playerTime_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(11, this.playerTime_);
            }
            if (this.isPaused_) {
                size += CodedOutputStream.computeBoolSize(14, this.isPaused_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayerTimeNotify)) {
                return super.equals(obj);
            }
            final PlayerTimeNotify other = (PlayerTimeNotify)obj;
            return this.getServerTime() == other.getServerTime() && this.getPlayerTime() == other.getPlayerTime() && this.getIsPaused() == other.getIsPaused() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 5;
            hash = 53 * hash + Internal.hashLong(this.getServerTime());
            hash = 37 * hash + 11;
            hash = 53 * hash + Internal.hashLong(this.getPlayerTime());
            hash = 37 * hash + 14;
            hash = 53 * hash + Internal.hashBoolean(this.getIsPaused());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PlayerTimeNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PlayerTimeNotify.PARSER.parseFrom(data);
        }
        
        public static PlayerTimeNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerTimeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerTimeNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PlayerTimeNotify.PARSER.parseFrom(data);
        }
        
        public static PlayerTimeNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerTimeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerTimeNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PlayerTimeNotify.PARSER.parseFrom(data);
        }
        
        public static PlayerTimeNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerTimeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerTimeNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerTimeNotify.PARSER, input);
        }
        
        public static PlayerTimeNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerTimeNotify.PARSER, input, extensionRegistry);
        }
        
        public static PlayerTimeNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerTimeNotify.PARSER, input);
        }
        
        public static PlayerTimeNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerTimeNotify.PARSER, input, extensionRegistry);
        }
        
        public static PlayerTimeNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerTimeNotify.PARSER, input);
        }
        
        public static PlayerTimeNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerTimeNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PlayerTimeNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PlayerTimeNotify prototype) {
            return PlayerTimeNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PlayerTimeNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PlayerTimeNotify getDefaultInstance() {
            return PlayerTimeNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<PlayerTimeNotify> parser() {
            return PlayerTimeNotify.PARSER;
        }
        
        @Override
        public Parser<PlayerTimeNotify> getParserForType() {
            return PlayerTimeNotify.PARSER;
        }
        
        @Override
        public PlayerTimeNotify getDefaultInstanceForType() {
            return PlayerTimeNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PlayerTimeNotify();
            PARSER = new AbstractParser<PlayerTimeNotify>() {
                @Override
                public PlayerTimeNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PlayerTimeNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlayerTimeNotifyOrBuilder
        {
            private long serverTime_;
            private long playerTime_;
            private boolean isPaused_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PlayerTimeNotifyOuterClass.internal_static_PlayerTimeNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PlayerTimeNotifyOuterClass.internal_static_PlayerTimeNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerTimeNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PlayerTimeNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.serverTime_ = 0L;
                this.playerTime_ = 0L;
                this.isPaused_ = false;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PlayerTimeNotifyOuterClass.internal_static_PlayerTimeNotify_descriptor;
            }
            
            @Override
            public PlayerTimeNotify getDefaultInstanceForType() {
                return PlayerTimeNotify.getDefaultInstance();
            }
            
            @Override
            public PlayerTimeNotify build() {
                final PlayerTimeNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PlayerTimeNotify buildPartial() {
                final PlayerTimeNotify result = new PlayerTimeNotify(this);
                result.serverTime_ = this.serverTime_;
                result.playerTime_ = this.playerTime_;
                result.isPaused_ = this.isPaused_;
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
                if (other instanceof PlayerTimeNotify) {
                    return this.mergeFrom((PlayerTimeNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PlayerTimeNotify other) {
                if (other == PlayerTimeNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getServerTime() != 0L) {
                    this.setServerTime(other.getServerTime());
                }
                if (other.getPlayerTime() != 0L) {
                    this.setPlayerTime(other.getPlayerTime());
                }
                if (other.getIsPaused()) {
                    this.setIsPaused(other.getIsPaused());
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
                PlayerTimeNotify parsedMessage = null;
                try {
                    parsedMessage = PlayerTimeNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PlayerTimeNotify)e.getUnfinishedMessage();
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
            public long getServerTime() {
                return this.serverTime_;
            }
            
            public Builder setServerTime(final long value) {
                this.serverTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearServerTime() {
                this.serverTime_ = 0L;
                this.onChanged();
                return this;
            }
            
            @Override
            public long getPlayerTime() {
                return this.playerTime_;
            }
            
            public Builder setPlayerTime(final long value) {
                this.playerTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPlayerTime() {
                this.playerTime_ = 0L;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsPaused() {
                return this.isPaused_;
            }
            
            public Builder setIsPaused(final boolean value) {
                this.isPaused_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsPaused() {
                this.isPaused_ = false;
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
    
    public interface PlayerTimeNotifyOrBuilder extends MessageOrBuilder
    {
        long getServerTime();
        
        long getPlayerTime();
        
        boolean getIsPaused();
    }
}
