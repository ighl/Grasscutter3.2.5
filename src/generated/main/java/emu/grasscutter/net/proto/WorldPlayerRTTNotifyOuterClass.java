// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class WorldPlayerRTTNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_WorldPlayerRTTNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WorldPlayerRTTNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private WorldPlayerRTTNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return WorldPlayerRTTNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001aWorldPlayerRTTNotify.proto\u001a\u0013PlayerRTTInfo.proto\"?\n\u0014WorldPlayerRTTNotify\u0012'\n\u000fplayer_rtt_list\u0018\u0001 \u0003(\u000b2\u000e.PlayerRTTInfoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        WorldPlayerRTTNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { PlayerRTTInfoOuterClass.getDescriptor() });
        internal_static_WorldPlayerRTTNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_WorldPlayerRTTNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(WorldPlayerRTTNotifyOuterClass.internal_static_WorldPlayerRTTNotify_descriptor, new String[] { "PlayerRttList" });
        PlayerRTTInfoOuterClass.getDescriptor();
    }
    
    public static final class WorldPlayerRTTNotify extends GeneratedMessageV3 implements WorldPlayerRTTNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int PLAYER_RTT_LIST_FIELD_NUMBER = 1;
        private List<PlayerRTTInfoOuterClass.PlayerRTTInfo> playerRttList_;
        private byte memoizedIsInitialized;
        private static final WorldPlayerRTTNotify DEFAULT_INSTANCE;
        private static final Parser<WorldPlayerRTTNotify> PARSER;
        
        private WorldPlayerRTTNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private WorldPlayerRTTNotify() {
            this.memoizedIsInitialized = -1;
            this.playerRttList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new WorldPlayerRTTNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private WorldPlayerRTTNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            int mutable_bitField0_ = 0;
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
                        case 10: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.playerRttList_ = new ArrayList<PlayerRTTInfoOuterClass.PlayerRTTInfo>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.playerRttList_.add(input.readMessage(PlayerRTTInfoOuterClass.PlayerRTTInfo.parser(), extensionRegistry));
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
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.playerRttList_ = Collections.unmodifiableList((List<? extends PlayerRTTInfoOuterClass.PlayerRTTInfo>)this.playerRttList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return WorldPlayerRTTNotifyOuterClass.internal_static_WorldPlayerRTTNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return WorldPlayerRTTNotifyOuterClass.internal_static_WorldPlayerRTTNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(WorldPlayerRTTNotify.class, Builder.class);
        }
        
        @Override
        public List<PlayerRTTInfoOuterClass.PlayerRTTInfo> getPlayerRttListList() {
            return this.playerRttList_;
        }
        
        @Override
        public List<? extends PlayerRTTInfoOuterClass.PlayerRTTInfoOrBuilder> getPlayerRttListOrBuilderList() {
            return this.playerRttList_;
        }
        
        @Override
        public int getPlayerRttListCount() {
            return this.playerRttList_.size();
        }
        
        @Override
        public PlayerRTTInfoOuterClass.PlayerRTTInfo getPlayerRttList(final int index) {
            return this.playerRttList_.get(index);
        }
        
        @Override
        public PlayerRTTInfoOuterClass.PlayerRTTInfoOrBuilder getPlayerRttListOrBuilder(final int index) {
            return this.playerRttList_.get(index);
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
            for (int i = 0; i < this.playerRttList_.size(); ++i) {
                output.writeMessage(1, this.playerRttList_.get(i));
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
            for (int i = 0; i < this.playerRttList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(1, this.playerRttList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WorldPlayerRTTNotify)) {
                return super.equals(obj);
            }
            final WorldPlayerRTTNotify other = (WorldPlayerRTTNotify)obj;
            return this.getPlayerRttListList().equals(other.getPlayerRttListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getPlayerRttListCount() > 0) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getPlayerRttListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static WorldPlayerRTTNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return WorldPlayerRTTNotify.PARSER.parseFrom(data);
        }
        
        public static WorldPlayerRTTNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WorldPlayerRTTNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WorldPlayerRTTNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return WorldPlayerRTTNotify.PARSER.parseFrom(data);
        }
        
        public static WorldPlayerRTTNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WorldPlayerRTTNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WorldPlayerRTTNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return WorldPlayerRTTNotify.PARSER.parseFrom(data);
        }
        
        public static WorldPlayerRTTNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WorldPlayerRTTNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WorldPlayerRTTNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WorldPlayerRTTNotify.PARSER, input);
        }
        
        public static WorldPlayerRTTNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WorldPlayerRTTNotify.PARSER, input, extensionRegistry);
        }
        
        public static WorldPlayerRTTNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WorldPlayerRTTNotify.PARSER, input);
        }
        
        public static WorldPlayerRTTNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WorldPlayerRTTNotify.PARSER, input, extensionRegistry);
        }
        
        public static WorldPlayerRTTNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WorldPlayerRTTNotify.PARSER, input);
        }
        
        public static WorldPlayerRTTNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WorldPlayerRTTNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return WorldPlayerRTTNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final WorldPlayerRTTNotify prototype) {
            return WorldPlayerRTTNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == WorldPlayerRTTNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static WorldPlayerRTTNotify getDefaultInstance() {
            return WorldPlayerRTTNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<WorldPlayerRTTNotify> parser() {
            return WorldPlayerRTTNotify.PARSER;
        }
        
        @Override
        public Parser<WorldPlayerRTTNotify> getParserForType() {
            return WorldPlayerRTTNotify.PARSER;
        }
        
        @Override
        public WorldPlayerRTTNotify getDefaultInstanceForType() {
            return WorldPlayerRTTNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new WorldPlayerRTTNotify();
            PARSER = new AbstractParser<WorldPlayerRTTNotify>() {
                @Override
                public WorldPlayerRTTNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new WorldPlayerRTTNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WorldPlayerRTTNotifyOrBuilder
        {
            private int bitField0_;
            private List<PlayerRTTInfoOuterClass.PlayerRTTInfo> playerRttList_;
            private RepeatedFieldBuilderV3<PlayerRTTInfoOuterClass.PlayerRTTInfo, PlayerRTTInfoOuterClass.PlayerRTTInfo.Builder, PlayerRTTInfoOuterClass.PlayerRTTInfoOrBuilder> playerRttListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return WorldPlayerRTTNotifyOuterClass.internal_static_WorldPlayerRTTNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return WorldPlayerRTTNotifyOuterClass.internal_static_WorldPlayerRTTNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(WorldPlayerRTTNotify.class, Builder.class);
            }
            
            private Builder() {
                this.playerRttList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.playerRttList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (WorldPlayerRTTNotify.alwaysUseFieldBuilders) {
                    this.getPlayerRttListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.playerRttListBuilder_ == null) {
                    this.playerRttList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.playerRttListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return WorldPlayerRTTNotifyOuterClass.internal_static_WorldPlayerRTTNotify_descriptor;
            }
            
            @Override
            public WorldPlayerRTTNotify getDefaultInstanceForType() {
                return WorldPlayerRTTNotify.getDefaultInstance();
            }
            
            @Override
            public WorldPlayerRTTNotify build() {
                final WorldPlayerRTTNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public WorldPlayerRTTNotify buildPartial() {
                final WorldPlayerRTTNotify result = new WorldPlayerRTTNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.playerRttListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.playerRttList_ = Collections.unmodifiableList((List<? extends PlayerRTTInfoOuterClass.PlayerRTTInfo>)this.playerRttList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.playerRttList_ = this.playerRttList_;
                }
                else {
                    result.playerRttList_ = this.playerRttListBuilder_.build();
                }
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
                if (other instanceof WorldPlayerRTTNotify) {
                    return this.mergeFrom((WorldPlayerRTTNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final WorldPlayerRTTNotify other) {
                if (other == WorldPlayerRTTNotify.getDefaultInstance()) {
                    return this;
                }
                if (this.playerRttListBuilder_ == null) {
                    if (!other.playerRttList_.isEmpty()) {
                        if (this.playerRttList_.isEmpty()) {
                            this.playerRttList_ = other.playerRttList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensurePlayerRttListIsMutable();
                            this.playerRttList_.addAll(other.playerRttList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.playerRttList_.isEmpty()) {
                    if (this.playerRttListBuilder_.isEmpty()) {
                        this.playerRttListBuilder_.dispose();
                        this.playerRttListBuilder_ = null;
                        this.playerRttList_ = other.playerRttList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.playerRttListBuilder_ = (WorldPlayerRTTNotify.alwaysUseFieldBuilders ? this.getPlayerRttListFieldBuilder() : null);
                    }
                    else {
                        this.playerRttListBuilder_.addAllMessages(other.playerRttList_);
                    }
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
                WorldPlayerRTTNotify parsedMessage = null;
                try {
                    parsedMessage = WorldPlayerRTTNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (WorldPlayerRTTNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensurePlayerRttListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.playerRttList_ = new ArrayList<PlayerRTTInfoOuterClass.PlayerRTTInfo>(this.playerRttList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<PlayerRTTInfoOuterClass.PlayerRTTInfo> getPlayerRttListList() {
                if (this.playerRttListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends PlayerRTTInfoOuterClass.PlayerRTTInfo>)this.playerRttList_);
                }
                return this.playerRttListBuilder_.getMessageList();
            }
            
            @Override
            public int getPlayerRttListCount() {
                if (this.playerRttListBuilder_ == null) {
                    return this.playerRttList_.size();
                }
                return this.playerRttListBuilder_.getCount();
            }
            
            @Override
            public PlayerRTTInfoOuterClass.PlayerRTTInfo getPlayerRttList(final int index) {
                if (this.playerRttListBuilder_ == null) {
                    return this.playerRttList_.get(index);
                }
                return this.playerRttListBuilder_.getMessage(index);
            }
            
            public Builder setPlayerRttList(final int index, final PlayerRTTInfoOuterClass.PlayerRTTInfo value) {
                if (this.playerRttListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePlayerRttListIsMutable();
                    this.playerRttList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.playerRttListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setPlayerRttList(final int index, final PlayerRTTInfoOuterClass.PlayerRTTInfo.Builder builderForValue) {
                if (this.playerRttListBuilder_ == null) {
                    this.ensurePlayerRttListIsMutable();
                    this.playerRttList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.playerRttListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addPlayerRttList(final PlayerRTTInfoOuterClass.PlayerRTTInfo value) {
                if (this.playerRttListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePlayerRttListIsMutable();
                    this.playerRttList_.add(value);
                    this.onChanged();
                }
                else {
                    this.playerRttListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addPlayerRttList(final int index, final PlayerRTTInfoOuterClass.PlayerRTTInfo value) {
                if (this.playerRttListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePlayerRttListIsMutable();
                    this.playerRttList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.playerRttListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addPlayerRttList(final PlayerRTTInfoOuterClass.PlayerRTTInfo.Builder builderForValue) {
                if (this.playerRttListBuilder_ == null) {
                    this.ensurePlayerRttListIsMutable();
                    this.playerRttList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.playerRttListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addPlayerRttList(final int index, final PlayerRTTInfoOuterClass.PlayerRTTInfo.Builder builderForValue) {
                if (this.playerRttListBuilder_ == null) {
                    this.ensurePlayerRttListIsMutable();
                    this.playerRttList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.playerRttListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllPlayerRttList(final Iterable<? extends PlayerRTTInfoOuterClass.PlayerRTTInfo> values) {
                if (this.playerRttListBuilder_ == null) {
                    this.ensurePlayerRttListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.playerRttList_);
                    this.onChanged();
                }
                else {
                    this.playerRttListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearPlayerRttList() {
                if (this.playerRttListBuilder_ == null) {
                    this.playerRttList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.playerRttListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removePlayerRttList(final int index) {
                if (this.playerRttListBuilder_ == null) {
                    this.ensurePlayerRttListIsMutable();
                    this.playerRttList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.playerRttListBuilder_.remove(index);
                }
                return this;
            }
            
            public PlayerRTTInfoOuterClass.PlayerRTTInfo.Builder getPlayerRttListBuilder(final int index) {
                return this.getPlayerRttListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public PlayerRTTInfoOuterClass.PlayerRTTInfoOrBuilder getPlayerRttListOrBuilder(final int index) {
                if (this.playerRttListBuilder_ == null) {
                    return this.playerRttList_.get(index);
                }
                return this.playerRttListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends PlayerRTTInfoOuterClass.PlayerRTTInfoOrBuilder> getPlayerRttListOrBuilderList() {
                if (this.playerRttListBuilder_ != null) {
                    return this.playerRttListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends PlayerRTTInfoOuterClass.PlayerRTTInfoOrBuilder>)this.playerRttList_);
            }
            
            public PlayerRTTInfoOuterClass.PlayerRTTInfo.Builder addPlayerRttListBuilder() {
                return this.getPlayerRttListFieldBuilder().addBuilder(PlayerRTTInfoOuterClass.PlayerRTTInfo.getDefaultInstance());
            }
            
            public PlayerRTTInfoOuterClass.PlayerRTTInfo.Builder addPlayerRttListBuilder(final int index) {
                return this.getPlayerRttListFieldBuilder().addBuilder(index, PlayerRTTInfoOuterClass.PlayerRTTInfo.getDefaultInstance());
            }
            
            public List<PlayerRTTInfoOuterClass.PlayerRTTInfo.Builder> getPlayerRttListBuilderList() {
                return this.getPlayerRttListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<PlayerRTTInfoOuterClass.PlayerRTTInfo, PlayerRTTInfoOuterClass.PlayerRTTInfo.Builder, PlayerRTTInfoOuterClass.PlayerRTTInfoOrBuilder> getPlayerRttListFieldBuilder() {
                if (this.playerRttListBuilder_ == null) {
                    this.playerRttListBuilder_ = new RepeatedFieldBuilderV3<PlayerRTTInfoOuterClass.PlayerRTTInfo, PlayerRTTInfoOuterClass.PlayerRTTInfo.Builder, PlayerRTTInfoOuterClass.PlayerRTTInfoOrBuilder>(this.playerRttList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.playerRttList_ = null;
                }
                return this.playerRttListBuilder_;
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
    
    public interface WorldPlayerRTTNotifyOrBuilder extends MessageOrBuilder
    {
        List<PlayerRTTInfoOuterClass.PlayerRTTInfo> getPlayerRttListList();
        
        PlayerRTTInfoOuterClass.PlayerRTTInfo getPlayerRttList(final int p0);
        
        int getPlayerRttListCount();
        
        List<? extends PlayerRTTInfoOuterClass.PlayerRTTInfoOrBuilder> getPlayerRttListOrBuilderList();
        
        PlayerRTTInfoOuterClass.PlayerRTTInfoOrBuilder getPlayerRttListOrBuilder(final int p0);
    }
}
