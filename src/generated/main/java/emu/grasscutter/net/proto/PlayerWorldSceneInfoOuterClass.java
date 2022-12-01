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

public final class PlayerWorldSceneInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_PlayerWorldSceneInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PlayerWorldSceneInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PlayerWorldSceneInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PlayerWorldSceneInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001aPlayerWorldSceneInfo.proto\"V\n\u0014PlayerWorldSceneInfo\u0012\u0010\n\bscene_id\u0018\u000b \u0001(\r\u0012\u0019\n\u0011scene_tag_id_list\u0018\b \u0003(\r\u0012\u0011\n\tis_locked\u0018\f \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PlayerWorldSceneInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_PlayerWorldSceneInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PlayerWorldSceneInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PlayerWorldSceneInfoOuterClass.internal_static_PlayerWorldSceneInfo_descriptor, new String[] { "SceneId", "SceneTagIdList", "IsLocked" });
    }
    
    public static final class PlayerWorldSceneInfo extends GeneratedMessageV3 implements PlayerWorldSceneInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SCENE_ID_FIELD_NUMBER = 11;
        private int sceneId_;
        public static final int SCENE_TAG_ID_LIST_FIELD_NUMBER = 8;
        private Internal.IntList sceneTagIdList_;
        private int sceneTagIdListMemoizedSerializedSize;
        public static final int IS_LOCKED_FIELD_NUMBER = 12;
        private boolean isLocked_;
        private byte memoizedIsInitialized;
        private static final PlayerWorldSceneInfo DEFAULT_INSTANCE;
        private static final Parser<PlayerWorldSceneInfo> PARSER;
        
        private PlayerWorldSceneInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.sceneTagIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private PlayerWorldSceneInfo() {
            this.sceneTagIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.sceneTagIdList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PlayerWorldSceneInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PlayerWorldSceneInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 64: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.sceneTagIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.sceneTagIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 66: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.sceneTagIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.sceneTagIdList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 88: {
                            this.sceneId_ = input.readUInt32();
                            continue;
                        }
                        case 96: {
                            this.isLocked_ = input.readBool();
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
                    this.sceneTagIdList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return PlayerWorldSceneInfoOuterClass.internal_static_PlayerWorldSceneInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PlayerWorldSceneInfoOuterClass.internal_static_PlayerWorldSceneInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerWorldSceneInfo.class, Builder.class);
        }
        
        @Override
        public int getSceneId() {
            return this.sceneId_;
        }
        
        @Override
        public List<Integer> getSceneTagIdListList() {
            return this.sceneTagIdList_;
        }
        
        @Override
        public int getSceneTagIdListCount() {
            return this.sceneTagIdList_.size();
        }
        
        @Override
        public int getSceneTagIdList(final int index) {
            return this.sceneTagIdList_.getInt(index);
        }
        
        @Override
        public boolean getIsLocked() {
            return this.isLocked_;
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
            if (this.getSceneTagIdListList().size() > 0) {
                output.writeUInt32NoTag(66);
                output.writeUInt32NoTag(this.sceneTagIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.sceneTagIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.sceneTagIdList_.getInt(i));
            }
            if (this.sceneId_ != 0) {
                output.writeUInt32(11, this.sceneId_);
            }
            if (this.isLocked_) {
                output.writeBool(12, this.isLocked_);
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
            for (int i = 0; i < this.sceneTagIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.sceneTagIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getSceneTagIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.sceneTagIdListMemoizedSerializedSize = dataSize;
            if (this.sceneId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.sceneId_);
            }
            if (this.isLocked_) {
                size += CodedOutputStream.computeBoolSize(12, this.isLocked_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayerWorldSceneInfo)) {
                return super.equals(obj);
            }
            final PlayerWorldSceneInfo other = (PlayerWorldSceneInfo)obj;
            return this.getSceneId() == other.getSceneId() && this.getSceneTagIdListList().equals(other.getSceneTagIdListList()) && this.getIsLocked() == other.getIsLocked() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getSceneId();
            if (this.getSceneTagIdListCount() > 0) {
                hash = 37 * hash + 8;
                hash = 53 * hash + this.getSceneTagIdListList().hashCode();
            }
            hash = 37 * hash + 12;
            hash = 53 * hash + Internal.hashBoolean(this.getIsLocked());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PlayerWorldSceneInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PlayerWorldSceneInfo.PARSER.parseFrom(data);
        }
        
        public static PlayerWorldSceneInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerWorldSceneInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerWorldSceneInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PlayerWorldSceneInfo.PARSER.parseFrom(data);
        }
        
        public static PlayerWorldSceneInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerWorldSceneInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerWorldSceneInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PlayerWorldSceneInfo.PARSER.parseFrom(data);
        }
        
        public static PlayerWorldSceneInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerWorldSceneInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerWorldSceneInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerWorldSceneInfo.PARSER, input);
        }
        
        public static PlayerWorldSceneInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerWorldSceneInfo.PARSER, input, extensionRegistry);
        }
        
        public static PlayerWorldSceneInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerWorldSceneInfo.PARSER, input);
        }
        
        public static PlayerWorldSceneInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerWorldSceneInfo.PARSER, input, extensionRegistry);
        }
        
        public static PlayerWorldSceneInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerWorldSceneInfo.PARSER, input);
        }
        
        public static PlayerWorldSceneInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerWorldSceneInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PlayerWorldSceneInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PlayerWorldSceneInfo prototype) {
            return PlayerWorldSceneInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PlayerWorldSceneInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PlayerWorldSceneInfo getDefaultInstance() {
            return PlayerWorldSceneInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<PlayerWorldSceneInfo> parser() {
            return PlayerWorldSceneInfo.PARSER;
        }
        
        @Override
        public Parser<PlayerWorldSceneInfo> getParserForType() {
            return PlayerWorldSceneInfo.PARSER;
        }
        
        @Override
        public PlayerWorldSceneInfo getDefaultInstanceForType() {
            return PlayerWorldSceneInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PlayerWorldSceneInfo();
            PARSER = new AbstractParser<PlayerWorldSceneInfo>() {
                @Override
                public PlayerWorldSceneInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PlayerWorldSceneInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlayerWorldSceneInfoOrBuilder
        {
            private int bitField0_;
            private int sceneId_;
            private Internal.IntList sceneTagIdList_;
            private boolean isLocked_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PlayerWorldSceneInfoOuterClass.internal_static_PlayerWorldSceneInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PlayerWorldSceneInfoOuterClass.internal_static_PlayerWorldSceneInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerWorldSceneInfo.class, Builder.class);
            }
            
            private Builder() {
                this.sceneTagIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.sceneTagIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PlayerWorldSceneInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.sceneId_ = 0;
                this.sceneTagIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.isLocked_ = false;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PlayerWorldSceneInfoOuterClass.internal_static_PlayerWorldSceneInfo_descriptor;
            }
            
            @Override
            public PlayerWorldSceneInfo getDefaultInstanceForType() {
                return PlayerWorldSceneInfo.getDefaultInstance();
            }
            
            @Override
            public PlayerWorldSceneInfo build() {
                final PlayerWorldSceneInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PlayerWorldSceneInfo buildPartial() {
                final PlayerWorldSceneInfo result = new PlayerWorldSceneInfo(this);
                final int from_bitField0_ = this.bitField0_;
                result.sceneId_ = this.sceneId_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.sceneTagIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.sceneTagIdList_ = this.sceneTagIdList_;
                result.isLocked_ = this.isLocked_;
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
                if (other instanceof PlayerWorldSceneInfo) {
                    return this.mergeFrom((PlayerWorldSceneInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PlayerWorldSceneInfo other) {
                if (other == PlayerWorldSceneInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getSceneId() != 0) {
                    this.setSceneId(other.getSceneId());
                }
                if (!other.sceneTagIdList_.isEmpty()) {
                    if (this.sceneTagIdList_.isEmpty()) {
                        this.sceneTagIdList_ = other.sceneTagIdList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureSceneTagIdListIsMutable();
                        this.sceneTagIdList_.addAll(other.sceneTagIdList_);
                    }
                    this.onChanged();
                }
                if (other.getIsLocked()) {
                    this.setIsLocked(other.getIsLocked());
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
                PlayerWorldSceneInfo parsedMessage = null;
                try {
                    parsedMessage = PlayerWorldSceneInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PlayerWorldSceneInfo)e.getUnfinishedMessage();
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
            
            private void ensureSceneTagIdListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.sceneTagIdList_ = GeneratedMessageV3.mutableCopy(this.sceneTagIdList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getSceneTagIdListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.sceneTagIdList_) : this.sceneTagIdList_;
            }
            
            @Override
            public int getSceneTagIdListCount() {
                return this.sceneTagIdList_.size();
            }
            
            @Override
            public int getSceneTagIdList(final int index) {
                return this.sceneTagIdList_.getInt(index);
            }
            
            public Builder setSceneTagIdList(final int index, final int value) {
                this.ensureSceneTagIdListIsMutable();
                this.sceneTagIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addSceneTagIdList(final int value) {
                this.ensureSceneTagIdListIsMutable();
                this.sceneTagIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllSceneTagIdList(final Iterable<? extends Integer> values) {
                this.ensureSceneTagIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.sceneTagIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearSceneTagIdList() {
                this.sceneTagIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsLocked() {
                return this.isLocked_;
            }
            
            public Builder setIsLocked(final boolean value) {
                this.isLocked_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsLocked() {
                this.isLocked_ = false;
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
    
    public interface PlayerWorldSceneInfoOrBuilder extends MessageOrBuilder
    {
        int getSceneId();
        
        List<Integer> getSceneTagIdListList();
        
        int getSceneTagIdListCount();
        
        int getSceneTagIdList(final int p0);
        
        boolean getIsLocked();
    }
}
