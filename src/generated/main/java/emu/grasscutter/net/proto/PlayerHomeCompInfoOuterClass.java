// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collections;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.util.List;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class PlayerHomeCompInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_PlayerHomeCompInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PlayerHomeCompInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PlayerHomeCompInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PlayerHomeCompInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018PlayerHomeCompInfo.proto\u001a\u001bFriendEnterHomeOption.proto\"³\u0001\n\u0012PlayerHomeCompInfo\u0012\u001f\n\u0017unlocked_module_id_list\u0018\u0004 \u0003(\r\u0012\u001b\n\u0013seen_module_id_list\u0018\u0002 \u0003(\r\u0012%\n\u001dlevelup_reward_got_level_list\u0018\u0007 \u0003(\r\u00128\n\u0018friend_enter_home_option\u0018\b \u0001(\u000e2\u0016.FriendEnterHomeOptionB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PlayerHomeCompInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { FriendEnterHomeOptionOuterClass.getDescriptor() });
        internal_static_PlayerHomeCompInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PlayerHomeCompInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PlayerHomeCompInfoOuterClass.internal_static_PlayerHomeCompInfo_descriptor, new String[] { "UnlockedModuleIdList", "SeenModuleIdList", "LevelupRewardGotLevelList", "FriendEnterHomeOption" });
        FriendEnterHomeOptionOuterClass.getDescriptor();
    }
    
    public static final class PlayerHomeCompInfo extends GeneratedMessageV3 implements PlayerHomeCompInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int UNLOCKED_MODULE_ID_LIST_FIELD_NUMBER = 4;
        private Internal.IntList unlockedModuleIdList_;
        private int unlockedModuleIdListMemoizedSerializedSize;
        public static final int SEEN_MODULE_ID_LIST_FIELD_NUMBER = 2;
        private Internal.IntList seenModuleIdList_;
        private int seenModuleIdListMemoizedSerializedSize;
        public static final int LEVELUP_REWARD_GOT_LEVEL_LIST_FIELD_NUMBER = 7;
        private Internal.IntList levelupRewardGotLevelList_;
        private int levelupRewardGotLevelListMemoizedSerializedSize;
        public static final int FRIEND_ENTER_HOME_OPTION_FIELD_NUMBER = 8;
        private int friendEnterHomeOption_;
        private byte memoizedIsInitialized;
        private static final PlayerHomeCompInfo DEFAULT_INSTANCE;
        private static final Parser<PlayerHomeCompInfo> PARSER;
        
        private PlayerHomeCompInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.unlockedModuleIdListMemoizedSerializedSize = -1;
            this.seenModuleIdListMemoizedSerializedSize = -1;
            this.levelupRewardGotLevelListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private PlayerHomeCompInfo() {
            this.unlockedModuleIdListMemoizedSerializedSize = -1;
            this.seenModuleIdListMemoizedSerializedSize = -1;
            this.levelupRewardGotLevelListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.unlockedModuleIdList_ = GeneratedMessageV3.emptyIntList();
            this.seenModuleIdList_ = GeneratedMessageV3.emptyIntList();
            this.levelupRewardGotLevelList_ = GeneratedMessageV3.emptyIntList();
            this.friendEnterHomeOption_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PlayerHomeCompInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PlayerHomeCompInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                this.seenModuleIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.seenModuleIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 18: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.seenModuleIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.seenModuleIdList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 32: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.unlockedModuleIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.unlockedModuleIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 34: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.unlockedModuleIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.unlockedModuleIdList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 56: {
                            if ((mutable_bitField0_ & 0x4) == 0x0) {
                                this.levelupRewardGotLevelList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.levelupRewardGotLevelList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 58: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x4) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.levelupRewardGotLevelList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x4;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.levelupRewardGotLevelList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 64: {
                            final int rawValue = input.readEnum();
                            this.friendEnterHomeOption_ = rawValue;
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
                    this.seenModuleIdList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.unlockedModuleIdList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x4) != 0x0) {
                    this.levelupRewardGotLevelList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return PlayerHomeCompInfoOuterClass.internal_static_PlayerHomeCompInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PlayerHomeCompInfoOuterClass.internal_static_PlayerHomeCompInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerHomeCompInfo.class, Builder.class);
        }
        
        @Override
        public List<Integer> getUnlockedModuleIdListList() {
            return this.unlockedModuleIdList_;
        }
        
        @Override
        public int getUnlockedModuleIdListCount() {
            return this.unlockedModuleIdList_.size();
        }
        
        @Override
        public int getUnlockedModuleIdList(final int index) {
            return this.unlockedModuleIdList_.getInt(index);
        }
        
        @Override
        public List<Integer> getSeenModuleIdListList() {
            return this.seenModuleIdList_;
        }
        
        @Override
        public int getSeenModuleIdListCount() {
            return this.seenModuleIdList_.size();
        }
        
        @Override
        public int getSeenModuleIdList(final int index) {
            return this.seenModuleIdList_.getInt(index);
        }
        
        @Override
        public List<Integer> getLevelupRewardGotLevelListList() {
            return this.levelupRewardGotLevelList_;
        }
        
        @Override
        public int getLevelupRewardGotLevelListCount() {
            return this.levelupRewardGotLevelList_.size();
        }
        
        @Override
        public int getLevelupRewardGotLevelList(final int index) {
            return this.levelupRewardGotLevelList_.getInt(index);
        }
        
        @Override
        public int getFriendEnterHomeOptionValue() {
            return this.friendEnterHomeOption_;
        }
        
        @Override
        public FriendEnterHomeOptionOuterClass.FriendEnterHomeOption getFriendEnterHomeOption() {
            final FriendEnterHomeOptionOuterClass.FriendEnterHomeOption result = FriendEnterHomeOptionOuterClass.FriendEnterHomeOption.valueOf(this.friendEnterHomeOption_);
            return (result == null) ? FriendEnterHomeOptionOuterClass.FriendEnterHomeOption.UNRECOGNIZED : result;
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
            if (this.getSeenModuleIdListList().size() > 0) {
                output.writeUInt32NoTag(18);
                output.writeUInt32NoTag(this.seenModuleIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.seenModuleIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.seenModuleIdList_.getInt(i));
            }
            if (this.getUnlockedModuleIdListList().size() > 0) {
                output.writeUInt32NoTag(34);
                output.writeUInt32NoTag(this.unlockedModuleIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.unlockedModuleIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.unlockedModuleIdList_.getInt(i));
            }
            if (this.getLevelupRewardGotLevelListList().size() > 0) {
                output.writeUInt32NoTag(58);
                output.writeUInt32NoTag(this.levelupRewardGotLevelListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.levelupRewardGotLevelList_.size(); ++i) {
                output.writeUInt32NoTag(this.levelupRewardGotLevelList_.getInt(i));
            }
            if (this.friendEnterHomeOption_ != FriendEnterHomeOptionOuterClass.FriendEnterHomeOption.FRIEND_ENTER_HOME_OPTION_NEED_CONFIRM.getNumber()) {
                output.writeEnum(8, this.friendEnterHomeOption_);
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
            for (int i = 0; i < this.seenModuleIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.seenModuleIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getSeenModuleIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.seenModuleIdListMemoizedSerializedSize = dataSize;
            dataSize = 0;
            for (int i = 0; i < this.unlockedModuleIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.unlockedModuleIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getUnlockedModuleIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.unlockedModuleIdListMemoizedSerializedSize = dataSize;
            dataSize = 0;
            for (int i = 0; i < this.levelupRewardGotLevelList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.levelupRewardGotLevelList_.getInt(i));
            }
            size += dataSize;
            if (!this.getLevelupRewardGotLevelListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.levelupRewardGotLevelListMemoizedSerializedSize = dataSize;
            if (this.friendEnterHomeOption_ != FriendEnterHomeOptionOuterClass.FriendEnterHomeOption.FRIEND_ENTER_HOME_OPTION_NEED_CONFIRM.getNumber()) {
                size += CodedOutputStream.computeEnumSize(8, this.friendEnterHomeOption_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayerHomeCompInfo)) {
                return super.equals(obj);
            }
            final PlayerHomeCompInfo other = (PlayerHomeCompInfo)obj;
            return this.getUnlockedModuleIdListList().equals(other.getUnlockedModuleIdListList()) && this.getSeenModuleIdListList().equals(other.getSeenModuleIdListList()) && this.getLevelupRewardGotLevelListList().equals(other.getLevelupRewardGotLevelListList()) && this.friendEnterHomeOption_ == other.friendEnterHomeOption_ && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getUnlockedModuleIdListCount() > 0) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.getUnlockedModuleIdListList().hashCode();
            }
            if (this.getSeenModuleIdListCount() > 0) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getSeenModuleIdListList().hashCode();
            }
            if (this.getLevelupRewardGotLevelListCount() > 0) {
                hash = 37 * hash + 7;
                hash = 53 * hash + this.getLevelupRewardGotLevelListList().hashCode();
            }
            hash = 37 * hash + 8;
            hash = 53 * hash + this.friendEnterHomeOption_;
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PlayerHomeCompInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PlayerHomeCompInfo.PARSER.parseFrom(data);
        }
        
        public static PlayerHomeCompInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerHomeCompInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerHomeCompInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PlayerHomeCompInfo.PARSER.parseFrom(data);
        }
        
        public static PlayerHomeCompInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerHomeCompInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerHomeCompInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PlayerHomeCompInfo.PARSER.parseFrom(data);
        }
        
        public static PlayerHomeCompInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerHomeCompInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerHomeCompInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerHomeCompInfo.PARSER, input);
        }
        
        public static PlayerHomeCompInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerHomeCompInfo.PARSER, input, extensionRegistry);
        }
        
        public static PlayerHomeCompInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerHomeCompInfo.PARSER, input);
        }
        
        public static PlayerHomeCompInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerHomeCompInfo.PARSER, input, extensionRegistry);
        }
        
        public static PlayerHomeCompInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerHomeCompInfo.PARSER, input);
        }
        
        public static PlayerHomeCompInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerHomeCompInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PlayerHomeCompInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PlayerHomeCompInfo prototype) {
            return PlayerHomeCompInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PlayerHomeCompInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PlayerHomeCompInfo getDefaultInstance() {
            return PlayerHomeCompInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<PlayerHomeCompInfo> parser() {
            return PlayerHomeCompInfo.PARSER;
        }
        
        @Override
        public Parser<PlayerHomeCompInfo> getParserForType() {
            return PlayerHomeCompInfo.PARSER;
        }
        
        @Override
        public PlayerHomeCompInfo getDefaultInstanceForType() {
            return PlayerHomeCompInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PlayerHomeCompInfo();
            PARSER = new AbstractParser<PlayerHomeCompInfo>() {
                @Override
                public PlayerHomeCompInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PlayerHomeCompInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlayerHomeCompInfoOrBuilder
        {
            private int bitField0_;
            private Internal.IntList unlockedModuleIdList_;
            private Internal.IntList seenModuleIdList_;
            private Internal.IntList levelupRewardGotLevelList_;
            private int friendEnterHomeOption_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PlayerHomeCompInfoOuterClass.internal_static_PlayerHomeCompInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PlayerHomeCompInfoOuterClass.internal_static_PlayerHomeCompInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerHomeCompInfo.class, Builder.class);
            }
            
            private Builder() {
                this.unlockedModuleIdList_ = GeneratedMessageV3.emptyIntList();
                this.seenModuleIdList_ = GeneratedMessageV3.emptyIntList();
                this.levelupRewardGotLevelList_ = GeneratedMessageV3.emptyIntList();
                this.friendEnterHomeOption_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.unlockedModuleIdList_ = GeneratedMessageV3.emptyIntList();
                this.seenModuleIdList_ = GeneratedMessageV3.emptyIntList();
                this.levelupRewardGotLevelList_ = GeneratedMessageV3.emptyIntList();
                this.friendEnterHomeOption_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PlayerHomeCompInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.unlockedModuleIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.seenModuleIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.levelupRewardGotLevelList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFB;
                this.friendEnterHomeOption_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PlayerHomeCompInfoOuterClass.internal_static_PlayerHomeCompInfo_descriptor;
            }
            
            @Override
            public PlayerHomeCompInfo getDefaultInstanceForType() {
                return PlayerHomeCompInfo.getDefaultInstance();
            }
            
            @Override
            public PlayerHomeCompInfo build() {
                final PlayerHomeCompInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PlayerHomeCompInfo buildPartial() {
                final PlayerHomeCompInfo result = new PlayerHomeCompInfo(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.unlockedModuleIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.unlockedModuleIdList_ = this.unlockedModuleIdList_;
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.seenModuleIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.seenModuleIdList_ = this.seenModuleIdList_;
                if ((this.bitField0_ & 0x4) != 0x0) {
                    this.levelupRewardGotLevelList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFB;
                }
                result.levelupRewardGotLevelList_ = this.levelupRewardGotLevelList_;
                result.friendEnterHomeOption_ = this.friendEnterHomeOption_;
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
                if (other instanceof PlayerHomeCompInfo) {
                    return this.mergeFrom((PlayerHomeCompInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PlayerHomeCompInfo other) {
                if (other == PlayerHomeCompInfo.getDefaultInstance()) {
                    return this;
                }
                if (!other.unlockedModuleIdList_.isEmpty()) {
                    if (this.unlockedModuleIdList_.isEmpty()) {
                        this.unlockedModuleIdList_ = other.unlockedModuleIdList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureUnlockedModuleIdListIsMutable();
                        this.unlockedModuleIdList_.addAll(other.unlockedModuleIdList_);
                    }
                    this.onChanged();
                }
                if (!other.seenModuleIdList_.isEmpty()) {
                    if (this.seenModuleIdList_.isEmpty()) {
                        this.seenModuleIdList_ = other.seenModuleIdList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensureSeenModuleIdListIsMutable();
                        this.seenModuleIdList_.addAll(other.seenModuleIdList_);
                    }
                    this.onChanged();
                }
                if (!other.levelupRewardGotLevelList_.isEmpty()) {
                    if (this.levelupRewardGotLevelList_.isEmpty()) {
                        this.levelupRewardGotLevelList_ = other.levelupRewardGotLevelList_;
                        this.bitField0_ &= 0xFFFFFFFB;
                    }
                    else {
                        this.ensureLevelupRewardGotLevelListIsMutable();
                        this.levelupRewardGotLevelList_.addAll(other.levelupRewardGotLevelList_);
                    }
                    this.onChanged();
                }
                if (other.friendEnterHomeOption_ != 0) {
                    this.setFriendEnterHomeOptionValue(other.getFriendEnterHomeOptionValue());
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
                PlayerHomeCompInfo parsedMessage = null;
                try {
                    parsedMessage = PlayerHomeCompInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PlayerHomeCompInfo)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureUnlockedModuleIdListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.unlockedModuleIdList_ = GeneratedMessageV3.mutableCopy(this.unlockedModuleIdList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getUnlockedModuleIdListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.unlockedModuleIdList_) : this.unlockedModuleIdList_;
            }
            
            @Override
            public int getUnlockedModuleIdListCount() {
                return this.unlockedModuleIdList_.size();
            }
            
            @Override
            public int getUnlockedModuleIdList(final int index) {
                return this.unlockedModuleIdList_.getInt(index);
            }
            
            public Builder setUnlockedModuleIdList(final int index, final int value) {
                this.ensureUnlockedModuleIdListIsMutable();
                this.unlockedModuleIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addUnlockedModuleIdList(final int value) {
                this.ensureUnlockedModuleIdListIsMutable();
                this.unlockedModuleIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllUnlockedModuleIdList(final Iterable<? extends Integer> values) {
                this.ensureUnlockedModuleIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.unlockedModuleIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearUnlockedModuleIdList() {
                this.unlockedModuleIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            private void ensureSeenModuleIdListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.seenModuleIdList_ = GeneratedMessageV3.mutableCopy(this.seenModuleIdList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Integer> getSeenModuleIdListList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.seenModuleIdList_) : this.seenModuleIdList_;
            }
            
            @Override
            public int getSeenModuleIdListCount() {
                return this.seenModuleIdList_.size();
            }
            
            @Override
            public int getSeenModuleIdList(final int index) {
                return this.seenModuleIdList_.getInt(index);
            }
            
            public Builder setSeenModuleIdList(final int index, final int value) {
                this.ensureSeenModuleIdListIsMutable();
                this.seenModuleIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addSeenModuleIdList(final int value) {
                this.ensureSeenModuleIdListIsMutable();
                this.seenModuleIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllSeenModuleIdList(final Iterable<? extends Integer> values) {
                this.ensureSeenModuleIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.seenModuleIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearSeenModuleIdList() {
                this.seenModuleIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.onChanged();
                return this;
            }
            
            private void ensureLevelupRewardGotLevelListIsMutable() {
                if ((this.bitField0_ & 0x4) == 0x0) {
                    this.levelupRewardGotLevelList_ = GeneratedMessageV3.mutableCopy(this.levelupRewardGotLevelList_);
                    this.bitField0_ |= 0x4;
                }
            }
            
            @Override
            public List<Integer> getLevelupRewardGotLevelListList() {
                return ((this.bitField0_ & 0x4) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.levelupRewardGotLevelList_) : this.levelupRewardGotLevelList_;
            }
            
            @Override
            public int getLevelupRewardGotLevelListCount() {
                return this.levelupRewardGotLevelList_.size();
            }
            
            @Override
            public int getLevelupRewardGotLevelList(final int index) {
                return this.levelupRewardGotLevelList_.getInt(index);
            }
            
            public Builder setLevelupRewardGotLevelList(final int index, final int value) {
                this.ensureLevelupRewardGotLevelListIsMutable();
                this.levelupRewardGotLevelList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addLevelupRewardGotLevelList(final int value) {
                this.ensureLevelupRewardGotLevelListIsMutable();
                this.levelupRewardGotLevelList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllLevelupRewardGotLevelList(final Iterable<? extends Integer> values) {
                this.ensureLevelupRewardGotLevelListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.levelupRewardGotLevelList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearLevelupRewardGotLevelList() {
                this.levelupRewardGotLevelList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFB;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getFriendEnterHomeOptionValue() {
                return this.friendEnterHomeOption_;
            }
            
            public Builder setFriendEnterHomeOptionValue(final int value) {
                this.friendEnterHomeOption_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public FriendEnterHomeOptionOuterClass.FriendEnterHomeOption getFriendEnterHomeOption() {
                final FriendEnterHomeOptionOuterClass.FriendEnterHomeOption result = FriendEnterHomeOptionOuterClass.FriendEnterHomeOption.valueOf(this.friendEnterHomeOption_);
                return (result == null) ? FriendEnterHomeOptionOuterClass.FriendEnterHomeOption.UNRECOGNIZED : result;
            }
            
            public Builder setFriendEnterHomeOption(final FriendEnterHomeOptionOuterClass.FriendEnterHomeOption value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.friendEnterHomeOption_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearFriendEnterHomeOption() {
                this.friendEnterHomeOption_ = 0;
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
    
    public interface PlayerHomeCompInfoOrBuilder extends MessageOrBuilder
    {
        List<Integer> getUnlockedModuleIdListList();
        
        int getUnlockedModuleIdListCount();
        
        int getUnlockedModuleIdList(final int p0);
        
        List<Integer> getSeenModuleIdListList();
        
        int getSeenModuleIdListCount();
        
        int getSeenModuleIdList(final int p0);
        
        List<Integer> getLevelupRewardGotLevelListList();
        
        int getLevelupRewardGotLevelListCount();
        
        int getLevelupRewardGotLevelList(final int p0);
        
        int getFriendEnterHomeOptionValue();
        
        FriendEnterHomeOptionOuterClass.FriendEnterHomeOption getFriendEnterHomeOption();
    }
}
