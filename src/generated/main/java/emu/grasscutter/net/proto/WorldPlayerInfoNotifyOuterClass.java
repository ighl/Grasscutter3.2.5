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
import com.google.protobuf.Internal;
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class WorldPlayerInfoNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_WorldPlayerInfoNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WorldPlayerInfoNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private WorldPlayerInfoNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return WorldPlayerInfoNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bWorldPlayerInfoNotify.proto\u001a\u0016OnlinePlayerInfo.proto\"]\n\u0015WorldPlayerInfoNotify\u0012+\n\u0010player_info_list\u0018\u0004 \u0003(\u000b2\u0011.OnlinePlayerInfo\u0012\u0017\n\u000fplayer_uid_list\u0018\u0002 \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        WorldPlayerInfoNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { OnlinePlayerInfoOuterClass.getDescriptor() });
        internal_static_WorldPlayerInfoNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_WorldPlayerInfoNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(WorldPlayerInfoNotifyOuterClass.internal_static_WorldPlayerInfoNotify_descriptor, new String[] { "PlayerInfoList", "PlayerUidList" });
        OnlinePlayerInfoOuterClass.getDescriptor();
    }
    
    public static final class WorldPlayerInfoNotify extends GeneratedMessageV3 implements WorldPlayerInfoNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int PLAYER_INFO_LIST_FIELD_NUMBER = 4;
        private List<OnlinePlayerInfoOuterClass.OnlinePlayerInfo> playerInfoList_;
        public static final int PLAYER_UID_LIST_FIELD_NUMBER = 2;
        private Internal.IntList playerUidList_;
        private int playerUidListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final WorldPlayerInfoNotify DEFAULT_INSTANCE;
        private static final Parser<WorldPlayerInfoNotify> PARSER;
        
        private WorldPlayerInfoNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.playerUidListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private WorldPlayerInfoNotify() {
            this.playerUidListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.playerInfoList_ = Collections.emptyList();
            this.playerUidList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new WorldPlayerInfoNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private WorldPlayerInfoNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 16: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.playerUidList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.playerUidList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 18: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.playerUidList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.playerUidList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 34: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.playerInfoList_ = new ArrayList<OnlinePlayerInfoOuterClass.OnlinePlayerInfo>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.playerInfoList_.add(input.readMessage(OnlinePlayerInfoOuterClass.OnlinePlayerInfo.parser(), extensionRegistry));
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
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.playerUidList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.playerInfoList_ = Collections.unmodifiableList((List<? extends OnlinePlayerInfoOuterClass.OnlinePlayerInfo>)this.playerInfoList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return WorldPlayerInfoNotifyOuterClass.internal_static_WorldPlayerInfoNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return WorldPlayerInfoNotifyOuterClass.internal_static_WorldPlayerInfoNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(WorldPlayerInfoNotify.class, Builder.class);
        }
        
        @Override
        public List<OnlinePlayerInfoOuterClass.OnlinePlayerInfo> getPlayerInfoListList() {
            return this.playerInfoList_;
        }
        
        @Override
        public List<? extends OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> getPlayerInfoListOrBuilderList() {
            return this.playerInfoList_;
        }
        
        @Override
        public int getPlayerInfoListCount() {
            return this.playerInfoList_.size();
        }
        
        @Override
        public OnlinePlayerInfoOuterClass.OnlinePlayerInfo getPlayerInfoList(final int index) {
            return this.playerInfoList_.get(index);
        }
        
        @Override
        public OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getPlayerInfoListOrBuilder(final int index) {
            return this.playerInfoList_.get(index);
        }
        
        @Override
        public List<Integer> getPlayerUidListList() {
            return this.playerUidList_;
        }
        
        @Override
        public int getPlayerUidListCount() {
            return this.playerUidList_.size();
        }
        
        @Override
        public int getPlayerUidList(final int index) {
            return this.playerUidList_.getInt(index);
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
            this.getSerializedSize();
            if (this.getPlayerUidListList().size() > 0) {
                output.writeUInt32NoTag(18);
                output.writeUInt32NoTag(this.playerUidListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.playerUidList_.size(); ++i) {
                output.writeUInt32NoTag(this.playerUidList_.getInt(i));
            }
            for (int i = 0; i < this.playerInfoList_.size(); ++i) {
                output.writeMessage(4, this.playerInfoList_.get(i));
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
            int dataSize = 0;
            for (int i = 0; i < this.playerUidList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.playerUidList_.getInt(i));
            }
            size += dataSize;
            if (!this.getPlayerUidListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.playerUidListMemoizedSerializedSize = dataSize;
            for (int j = 0; j < this.playerInfoList_.size(); ++j) {
                size += CodedOutputStream.computeMessageSize(4, this.playerInfoList_.get(j));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WorldPlayerInfoNotify)) {
                return super.equals(obj);
            }
            final WorldPlayerInfoNotify other = (WorldPlayerInfoNotify)obj;
            return this.getPlayerInfoListList().equals(other.getPlayerInfoListList()) && this.getPlayerUidListList().equals(other.getPlayerUidListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getPlayerInfoListCount() > 0) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.getPlayerInfoListList().hashCode();
            }
            if (this.getPlayerUidListCount() > 0) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getPlayerUidListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static WorldPlayerInfoNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return WorldPlayerInfoNotify.PARSER.parseFrom(data);
        }
        
        public static WorldPlayerInfoNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WorldPlayerInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WorldPlayerInfoNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return WorldPlayerInfoNotify.PARSER.parseFrom(data);
        }
        
        public static WorldPlayerInfoNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WorldPlayerInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WorldPlayerInfoNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return WorldPlayerInfoNotify.PARSER.parseFrom(data);
        }
        
        public static WorldPlayerInfoNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WorldPlayerInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WorldPlayerInfoNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WorldPlayerInfoNotify.PARSER, input);
        }
        
        public static WorldPlayerInfoNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WorldPlayerInfoNotify.PARSER, input, extensionRegistry);
        }
        
        public static WorldPlayerInfoNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WorldPlayerInfoNotify.PARSER, input);
        }
        
        public static WorldPlayerInfoNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WorldPlayerInfoNotify.PARSER, input, extensionRegistry);
        }
        
        public static WorldPlayerInfoNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WorldPlayerInfoNotify.PARSER, input);
        }
        
        public static WorldPlayerInfoNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WorldPlayerInfoNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return WorldPlayerInfoNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final WorldPlayerInfoNotify prototype) {
            return WorldPlayerInfoNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == WorldPlayerInfoNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static WorldPlayerInfoNotify getDefaultInstance() {
            return WorldPlayerInfoNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<WorldPlayerInfoNotify> parser() {
            return WorldPlayerInfoNotify.PARSER;
        }
        
        @Override
        public Parser<WorldPlayerInfoNotify> getParserForType() {
            return WorldPlayerInfoNotify.PARSER;
        }
        
        @Override
        public WorldPlayerInfoNotify getDefaultInstanceForType() {
            return WorldPlayerInfoNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new WorldPlayerInfoNotify();
            PARSER = new AbstractParser<WorldPlayerInfoNotify>() {
                @Override
                public WorldPlayerInfoNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new WorldPlayerInfoNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WorldPlayerInfoNotifyOrBuilder
        {
            private int bitField0_;
            private List<OnlinePlayerInfoOuterClass.OnlinePlayerInfo> playerInfoList_;
            private RepeatedFieldBuilderV3<OnlinePlayerInfoOuterClass.OnlinePlayerInfo, OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> playerInfoListBuilder_;
            private Internal.IntList playerUidList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return WorldPlayerInfoNotifyOuterClass.internal_static_WorldPlayerInfoNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return WorldPlayerInfoNotifyOuterClass.internal_static_WorldPlayerInfoNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(WorldPlayerInfoNotify.class, Builder.class);
            }
            
            private Builder() {
                this.playerInfoList_ = Collections.emptyList();
                this.playerUidList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.playerInfoList_ = Collections.emptyList();
                this.playerUidList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (WorldPlayerInfoNotify.alwaysUseFieldBuilders) {
                    this.getPlayerInfoListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.playerInfoListBuilder_ == null) {
                    this.playerInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.playerInfoListBuilder_.clear();
                }
                this.playerUidList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return WorldPlayerInfoNotifyOuterClass.internal_static_WorldPlayerInfoNotify_descriptor;
            }
            
            @Override
            public WorldPlayerInfoNotify getDefaultInstanceForType() {
                return WorldPlayerInfoNotify.getDefaultInstance();
            }
            
            @Override
            public WorldPlayerInfoNotify build() {
                final WorldPlayerInfoNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public WorldPlayerInfoNotify buildPartial() {
                final WorldPlayerInfoNotify result = new WorldPlayerInfoNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.playerInfoListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.playerInfoList_ = Collections.unmodifiableList((List<? extends OnlinePlayerInfoOuterClass.OnlinePlayerInfo>)this.playerInfoList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.playerInfoList_ = this.playerInfoList_;
                }
                else {
                    result.playerInfoList_ = this.playerInfoListBuilder_.build();
                }
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.playerUidList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.playerUidList_ = this.playerUidList_;
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
                if (other instanceof WorldPlayerInfoNotify) {
                    return this.mergeFrom((WorldPlayerInfoNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final WorldPlayerInfoNotify other) {
                if (other == WorldPlayerInfoNotify.getDefaultInstance()) {
                    return this;
                }
                if (this.playerInfoListBuilder_ == null) {
                    if (!other.playerInfoList_.isEmpty()) {
                        if (this.playerInfoList_.isEmpty()) {
                            this.playerInfoList_ = other.playerInfoList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensurePlayerInfoListIsMutable();
                            this.playerInfoList_.addAll(other.playerInfoList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.playerInfoList_.isEmpty()) {
                    if (this.playerInfoListBuilder_.isEmpty()) {
                        this.playerInfoListBuilder_.dispose();
                        this.playerInfoListBuilder_ = null;
                        this.playerInfoList_ = other.playerInfoList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.playerInfoListBuilder_ = (WorldPlayerInfoNotify.alwaysUseFieldBuilders ? this.getPlayerInfoListFieldBuilder() : null);
                    }
                    else {
                        this.playerInfoListBuilder_.addAllMessages(other.playerInfoList_);
                    }
                }
                if (!other.playerUidList_.isEmpty()) {
                    if (this.playerUidList_.isEmpty()) {
                        this.playerUidList_ = other.playerUidList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensurePlayerUidListIsMutable();
                        this.playerUidList_.addAll(other.playerUidList_);
                    }
                    this.onChanged();
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
                WorldPlayerInfoNotify parsedMessage = null;
                try {
                    parsedMessage = WorldPlayerInfoNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (WorldPlayerInfoNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensurePlayerInfoListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.playerInfoList_ = new ArrayList<OnlinePlayerInfoOuterClass.OnlinePlayerInfo>(this.playerInfoList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<OnlinePlayerInfoOuterClass.OnlinePlayerInfo> getPlayerInfoListList() {
                if (this.playerInfoListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends OnlinePlayerInfoOuterClass.OnlinePlayerInfo>)this.playerInfoList_);
                }
                return this.playerInfoListBuilder_.getMessageList();
            }
            
            @Override
            public int getPlayerInfoListCount() {
                if (this.playerInfoListBuilder_ == null) {
                    return this.playerInfoList_.size();
                }
                return this.playerInfoListBuilder_.getCount();
            }
            
            @Override
            public OnlinePlayerInfoOuterClass.OnlinePlayerInfo getPlayerInfoList(final int index) {
                if (this.playerInfoListBuilder_ == null) {
                    return this.playerInfoList_.get(index);
                }
                return this.playerInfoListBuilder_.getMessage(index);
            }
            
            public Builder setPlayerInfoList(final int index, final OnlinePlayerInfoOuterClass.OnlinePlayerInfo value) {
                if (this.playerInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePlayerInfoListIsMutable();
                    this.playerInfoList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.playerInfoListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setPlayerInfoList(final int index, final OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder builderForValue) {
                if (this.playerInfoListBuilder_ == null) {
                    this.ensurePlayerInfoListIsMutable();
                    this.playerInfoList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.playerInfoListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addPlayerInfoList(final OnlinePlayerInfoOuterClass.OnlinePlayerInfo value) {
                if (this.playerInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePlayerInfoListIsMutable();
                    this.playerInfoList_.add(value);
                    this.onChanged();
                }
                else {
                    this.playerInfoListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addPlayerInfoList(final int index, final OnlinePlayerInfoOuterClass.OnlinePlayerInfo value) {
                if (this.playerInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePlayerInfoListIsMutable();
                    this.playerInfoList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.playerInfoListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addPlayerInfoList(final OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder builderForValue) {
                if (this.playerInfoListBuilder_ == null) {
                    this.ensurePlayerInfoListIsMutable();
                    this.playerInfoList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.playerInfoListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addPlayerInfoList(final int index, final OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder builderForValue) {
                if (this.playerInfoListBuilder_ == null) {
                    this.ensurePlayerInfoListIsMutable();
                    this.playerInfoList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.playerInfoListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllPlayerInfoList(final Iterable<? extends OnlinePlayerInfoOuterClass.OnlinePlayerInfo> values) {
                if (this.playerInfoListBuilder_ == null) {
                    this.ensurePlayerInfoListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.playerInfoList_);
                    this.onChanged();
                }
                else {
                    this.playerInfoListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearPlayerInfoList() {
                if (this.playerInfoListBuilder_ == null) {
                    this.playerInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.playerInfoListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removePlayerInfoList(final int index) {
                if (this.playerInfoListBuilder_ == null) {
                    this.ensurePlayerInfoListIsMutable();
                    this.playerInfoList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.playerInfoListBuilder_.remove(index);
                }
                return this;
            }
            
            public OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder getPlayerInfoListBuilder(final int index) {
                return this.getPlayerInfoListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getPlayerInfoListOrBuilder(final int index) {
                if (this.playerInfoListBuilder_ == null) {
                    return this.playerInfoList_.get(index);
                }
                return this.playerInfoListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> getPlayerInfoListOrBuilderList() {
                if (this.playerInfoListBuilder_ != null) {
                    return this.playerInfoListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder>)this.playerInfoList_);
            }
            
            public OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder addPlayerInfoListBuilder() {
                return this.getPlayerInfoListFieldBuilder().addBuilder(OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance());
            }
            
            public OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder addPlayerInfoListBuilder(final int index) {
                return this.getPlayerInfoListFieldBuilder().addBuilder(index, OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance());
            }
            
            public List<OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder> getPlayerInfoListBuilderList() {
                return this.getPlayerInfoListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<OnlinePlayerInfoOuterClass.OnlinePlayerInfo, OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> getPlayerInfoListFieldBuilder() {
                if (this.playerInfoListBuilder_ == null) {
                    this.playerInfoListBuilder_ = new RepeatedFieldBuilderV3<OnlinePlayerInfoOuterClass.OnlinePlayerInfo, OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder>(this.playerInfoList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.playerInfoList_ = null;
                }
                return this.playerInfoListBuilder_;
            }
            
            private void ensurePlayerUidListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.playerUidList_ = GeneratedMessageV3.mutableCopy(this.playerUidList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Integer> getPlayerUidListList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.playerUidList_) : this.playerUidList_;
            }
            
            @Override
            public int getPlayerUidListCount() {
                return this.playerUidList_.size();
            }
            
            @Override
            public int getPlayerUidList(final int index) {
                return this.playerUidList_.getInt(index);
            }
            
            public Builder setPlayerUidList(final int index, final int value) {
                this.ensurePlayerUidListIsMutable();
                this.playerUidList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addPlayerUidList(final int value) {
                this.ensurePlayerUidListIsMutable();
                this.playerUidList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllPlayerUidList(final Iterable<? extends Integer> values) {
                this.ensurePlayerUidListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.playerUidList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearPlayerUidList() {
                this.playerUidList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
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
    
    public interface WorldPlayerInfoNotifyOrBuilder extends MessageOrBuilder
    {
        List<OnlinePlayerInfoOuterClass.OnlinePlayerInfo> getPlayerInfoListList();
        
        OnlinePlayerInfoOuterClass.OnlinePlayerInfo getPlayerInfoList(final int p0);
        
        int getPlayerInfoListCount();
        
        List<? extends OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> getPlayerInfoListOrBuilderList();
        
        OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getPlayerInfoListOrBuilder(final int p0);
        
        List<Integer> getPlayerUidListList();
        
        int getPlayerUidListCount();
        
        int getPlayerUidList(final int p0);
    }
}
