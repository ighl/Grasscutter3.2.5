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

public final class PlayerLevelRewardUpdateNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_PlayerLevelRewardUpdateNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PlayerLevelRewardUpdateNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PlayerLevelRewardUpdateNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PlayerLevelRewardUpdateNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n#PlayerLevelRewardUpdateNotify.proto\"3\n\u001dPlayerLevelRewardUpdateNotify\u0012\u0012\n\nlevel_list\u0018\t \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PlayerLevelRewardUpdateNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_PlayerLevelRewardUpdateNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PlayerLevelRewardUpdateNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PlayerLevelRewardUpdateNotifyOuterClass.internal_static_PlayerLevelRewardUpdateNotify_descriptor, new String[] { "LevelList" });
    }
    
    public static final class PlayerLevelRewardUpdateNotify extends GeneratedMessageV3 implements PlayerLevelRewardUpdateNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int LEVEL_LIST_FIELD_NUMBER = 9;
        private Internal.IntList levelList_;
        private int levelListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final PlayerLevelRewardUpdateNotify DEFAULT_INSTANCE;
        private static final Parser<PlayerLevelRewardUpdateNotify> PARSER;
        
        private PlayerLevelRewardUpdateNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.levelListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private PlayerLevelRewardUpdateNotify() {
            this.levelListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.levelList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PlayerLevelRewardUpdateNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PlayerLevelRewardUpdateNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 72: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.levelList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.levelList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 74: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.levelList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.levelList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
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
                    this.levelList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return PlayerLevelRewardUpdateNotifyOuterClass.internal_static_PlayerLevelRewardUpdateNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PlayerLevelRewardUpdateNotifyOuterClass.internal_static_PlayerLevelRewardUpdateNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerLevelRewardUpdateNotify.class, Builder.class);
        }
        
        @Override
        public List<Integer> getLevelListList() {
            return this.levelList_;
        }
        
        @Override
        public int getLevelListCount() {
            return this.levelList_.size();
        }
        
        @Override
        public int getLevelList(final int index) {
            return this.levelList_.getInt(index);
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
            if (this.getLevelListList().size() > 0) {
                output.writeUInt32NoTag(74);
                output.writeUInt32NoTag(this.levelListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.levelList_.size(); ++i) {
                output.writeUInt32NoTag(this.levelList_.getInt(i));
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
            for (int i = 0; i < this.levelList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.levelList_.getInt(i));
            }
            size += dataSize;
            if (!this.getLevelListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.levelListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayerLevelRewardUpdateNotify)) {
                return super.equals(obj);
            }
            final PlayerLevelRewardUpdateNotify other = (PlayerLevelRewardUpdateNotify)obj;
            return this.getLevelListList().equals(other.getLevelListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getLevelListCount() > 0) {
                hash = 37 * hash + 9;
                hash = 53 * hash + this.getLevelListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PlayerLevelRewardUpdateNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PlayerLevelRewardUpdateNotify.PARSER.parseFrom(data);
        }
        
        public static PlayerLevelRewardUpdateNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerLevelRewardUpdateNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerLevelRewardUpdateNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PlayerLevelRewardUpdateNotify.PARSER.parseFrom(data);
        }
        
        public static PlayerLevelRewardUpdateNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerLevelRewardUpdateNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerLevelRewardUpdateNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PlayerLevelRewardUpdateNotify.PARSER.parseFrom(data);
        }
        
        public static PlayerLevelRewardUpdateNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerLevelRewardUpdateNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerLevelRewardUpdateNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerLevelRewardUpdateNotify.PARSER, input);
        }
        
        public static PlayerLevelRewardUpdateNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerLevelRewardUpdateNotify.PARSER, input, extensionRegistry);
        }
        
        public static PlayerLevelRewardUpdateNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerLevelRewardUpdateNotify.PARSER, input);
        }
        
        public static PlayerLevelRewardUpdateNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerLevelRewardUpdateNotify.PARSER, input, extensionRegistry);
        }
        
        public static PlayerLevelRewardUpdateNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerLevelRewardUpdateNotify.PARSER, input);
        }
        
        public static PlayerLevelRewardUpdateNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerLevelRewardUpdateNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PlayerLevelRewardUpdateNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PlayerLevelRewardUpdateNotify prototype) {
            return PlayerLevelRewardUpdateNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PlayerLevelRewardUpdateNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PlayerLevelRewardUpdateNotify getDefaultInstance() {
            return PlayerLevelRewardUpdateNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<PlayerLevelRewardUpdateNotify> parser() {
            return PlayerLevelRewardUpdateNotify.PARSER;
        }
        
        @Override
        public Parser<PlayerLevelRewardUpdateNotify> getParserForType() {
            return PlayerLevelRewardUpdateNotify.PARSER;
        }
        
        @Override
        public PlayerLevelRewardUpdateNotify getDefaultInstanceForType() {
            return PlayerLevelRewardUpdateNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PlayerLevelRewardUpdateNotify();
            PARSER = new AbstractParser<PlayerLevelRewardUpdateNotify>() {
                @Override
                public PlayerLevelRewardUpdateNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PlayerLevelRewardUpdateNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlayerLevelRewardUpdateNotifyOrBuilder
        {
            private int bitField0_;
            private Internal.IntList levelList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PlayerLevelRewardUpdateNotifyOuterClass.internal_static_PlayerLevelRewardUpdateNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PlayerLevelRewardUpdateNotifyOuterClass.internal_static_PlayerLevelRewardUpdateNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerLevelRewardUpdateNotify.class, Builder.class);
            }
            
            private Builder() {
                this.levelList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.levelList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PlayerLevelRewardUpdateNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.levelList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PlayerLevelRewardUpdateNotifyOuterClass.internal_static_PlayerLevelRewardUpdateNotify_descriptor;
            }
            
            @Override
            public PlayerLevelRewardUpdateNotify getDefaultInstanceForType() {
                return PlayerLevelRewardUpdateNotify.getDefaultInstance();
            }
            
            @Override
            public PlayerLevelRewardUpdateNotify build() {
                final PlayerLevelRewardUpdateNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PlayerLevelRewardUpdateNotify buildPartial() {
                final PlayerLevelRewardUpdateNotify result = new PlayerLevelRewardUpdateNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.levelList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.levelList_ = this.levelList_;
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
                if (other instanceof PlayerLevelRewardUpdateNotify) {
                    return this.mergeFrom((PlayerLevelRewardUpdateNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PlayerLevelRewardUpdateNotify other) {
                if (other == PlayerLevelRewardUpdateNotify.getDefaultInstance()) {
                    return this;
                }
                if (!other.levelList_.isEmpty()) {
                    if (this.levelList_.isEmpty()) {
                        this.levelList_ = other.levelList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureLevelListIsMutable();
                        this.levelList_.addAll(other.levelList_);
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
                PlayerLevelRewardUpdateNotify parsedMessage = null;
                try {
                    parsedMessage = PlayerLevelRewardUpdateNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PlayerLevelRewardUpdateNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureLevelListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.levelList_ = GeneratedMessageV3.mutableCopy(this.levelList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getLevelListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.levelList_) : this.levelList_;
            }
            
            @Override
            public int getLevelListCount() {
                return this.levelList_.size();
            }
            
            @Override
            public int getLevelList(final int index) {
                return this.levelList_.getInt(index);
            }
            
            public Builder setLevelList(final int index, final int value) {
                this.ensureLevelListIsMutable();
                this.levelList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addLevelList(final int value) {
                this.ensureLevelListIsMutable();
                this.levelList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllLevelList(final Iterable<? extends Integer> values) {
                this.ensureLevelListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.levelList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearLevelList() {
                this.levelList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
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
    
    public interface PlayerLevelRewardUpdateNotifyOrBuilder extends MessageOrBuilder
    {
        List<Integer> getLevelListList();
        
        int getLevelListCount();
        
        int getLevelList(final int p0);
    }
}
