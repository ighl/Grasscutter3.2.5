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

public final class TowerTeamOuterClass
{
    private static final Descriptors.Descriptor internal_static_TowerTeam_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_TowerTeam_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private TowerTeamOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return TowerTeamOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u000fTowerTeam.proto\"<\n\tTowerTeam\u0012\u0015\n\rtower_team_id\u0018\u0003 \u0001(\r\u0012\u0018\n\u0010avatar_guid_list\u0018\u000e \u0003(\u0004B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        TowerTeamOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_TowerTeam_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_TowerTeam_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(TowerTeamOuterClass.internal_static_TowerTeam_descriptor, new String[] { "TowerTeamId", "AvatarGuidList" });
    }
    
    public static final class TowerTeam extends GeneratedMessageV3 implements TowerTeamOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int TOWER_TEAM_ID_FIELD_NUMBER = 3;
        private int towerTeamId_;
        public static final int AVATAR_GUID_LIST_FIELD_NUMBER = 14;
        private Internal.LongList avatarGuidList_;
        private int avatarGuidListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final TowerTeam DEFAULT_INSTANCE;
        private static final Parser<TowerTeam> PARSER;
        
        private TowerTeam(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.avatarGuidListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private TowerTeam() {
            this.avatarGuidListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.avatarGuidList_ = GeneratedMessageV3.emptyLongList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new TowerTeam();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private TowerTeam(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 24: {
                            this.towerTeamId_ = input.readUInt32();
                            continue;
                        }
                        case 112: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.avatarGuidList_ = GeneratedMessageV3.newLongList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.avatarGuidList_.addLong(input.readUInt64());
                            continue;
                        }
                        case 114: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.avatarGuidList_ = GeneratedMessageV3.newLongList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.avatarGuidList_.addLong(input.readUInt64());
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
                    this.avatarGuidList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return TowerTeamOuterClass.internal_static_TowerTeam_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return TowerTeamOuterClass.internal_static_TowerTeam_fieldAccessorTable.ensureFieldAccessorsInitialized(TowerTeam.class, Builder.class);
        }
        
        @Override
        public int getTowerTeamId() {
            return this.towerTeamId_;
        }
        
        @Override
        public List<Long> getAvatarGuidListList() {
            return this.avatarGuidList_;
        }
        
        @Override
        public int getAvatarGuidListCount() {
            return this.avatarGuidList_.size();
        }
        
        @Override
        public long getAvatarGuidList(final int index) {
            return this.avatarGuidList_.getLong(index);
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
            if (this.towerTeamId_ != 0) {
                output.writeUInt32(3, this.towerTeamId_);
            }
            if (this.getAvatarGuidListList().size() > 0) {
                output.writeUInt32NoTag(114);
                output.writeUInt32NoTag(this.avatarGuidListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.avatarGuidList_.size(); ++i) {
                output.writeUInt64NoTag(this.avatarGuidList_.getLong(i));
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
            if (this.towerTeamId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.towerTeamId_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.avatarGuidList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt64SizeNoTag(this.avatarGuidList_.getLong(i));
            }
            size += dataSize;
            if (!this.getAvatarGuidListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.avatarGuidListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TowerTeam)) {
                return super.equals(obj);
            }
            final TowerTeam other = (TowerTeam)obj;
            return this.getTowerTeamId() == other.getTowerTeamId() && this.getAvatarGuidListList().equals(other.getAvatarGuidListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getTowerTeamId();
            if (this.getAvatarGuidListCount() > 0) {
                hash = 37 * hash + 14;
                hash = 53 * hash + this.getAvatarGuidListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static TowerTeam parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return TowerTeam.PARSER.parseFrom(data);
        }
        
        public static TowerTeam parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerTeam.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerTeam parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return TowerTeam.PARSER.parseFrom(data);
        }
        
        public static TowerTeam parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerTeam.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerTeam parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return TowerTeam.PARSER.parseFrom(data);
        }
        
        public static TowerTeam parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerTeam.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerTeam parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerTeam.PARSER, input);
        }
        
        public static TowerTeam parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerTeam.PARSER, input, extensionRegistry);
        }
        
        public static TowerTeam parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TowerTeam.PARSER, input);
        }
        
        public static TowerTeam parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TowerTeam.PARSER, input, extensionRegistry);
        }
        
        public static TowerTeam parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerTeam.PARSER, input);
        }
        
        public static TowerTeam parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerTeam.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return TowerTeam.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final TowerTeam prototype) {
            return TowerTeam.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == TowerTeam.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static TowerTeam getDefaultInstance() {
            return TowerTeam.DEFAULT_INSTANCE;
        }
        
        public static Parser<TowerTeam> parser() {
            return TowerTeam.PARSER;
        }
        
        @Override
        public Parser<TowerTeam> getParserForType() {
            return TowerTeam.PARSER;
        }
        
        @Override
        public TowerTeam getDefaultInstanceForType() {
            return TowerTeam.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new TowerTeam();
            PARSER = new AbstractParser<TowerTeam>() {
                @Override
                public TowerTeam parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new TowerTeam(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TowerTeamOrBuilder
        {
            private int bitField0_;
            private int towerTeamId_;
            private Internal.LongList avatarGuidList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return TowerTeamOuterClass.internal_static_TowerTeam_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return TowerTeamOuterClass.internal_static_TowerTeam_fieldAccessorTable.ensureFieldAccessorsInitialized(TowerTeam.class, Builder.class);
            }
            
            private Builder() {
                this.avatarGuidList_ = GeneratedMessageV3.emptyLongList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.avatarGuidList_ = GeneratedMessageV3.emptyLongList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (TowerTeam.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.towerTeamId_ = 0;
                this.avatarGuidList_ = GeneratedMessageV3.emptyLongList();
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return TowerTeamOuterClass.internal_static_TowerTeam_descriptor;
            }
            
            @Override
            public TowerTeam getDefaultInstanceForType() {
                return TowerTeam.getDefaultInstance();
            }
            
            @Override
            public TowerTeam build() {
                final TowerTeam result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public TowerTeam buildPartial() {
                final TowerTeam result = new TowerTeam(this);
                final int from_bitField0_ = this.bitField0_;
                result.towerTeamId_ = this.towerTeamId_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.avatarGuidList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.avatarGuidList_ = this.avatarGuidList_;
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
                if (other instanceof TowerTeam) {
                    return this.mergeFrom((TowerTeam)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final TowerTeam other) {
                if (other == TowerTeam.getDefaultInstance()) {
                    return this;
                }
                if (other.getTowerTeamId() != 0) {
                    this.setTowerTeamId(other.getTowerTeamId());
                }
                if (!other.avatarGuidList_.isEmpty()) {
                    if (this.avatarGuidList_.isEmpty()) {
                        this.avatarGuidList_ = other.avatarGuidList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureAvatarGuidListIsMutable();
                        this.avatarGuidList_.addAll(other.avatarGuidList_);
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
                TowerTeam parsedMessage = null;
                try {
                    parsedMessage = TowerTeam.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (TowerTeam)e.getUnfinishedMessage();
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
            public int getTowerTeamId() {
                return this.towerTeamId_;
            }
            
            public Builder setTowerTeamId(final int value) {
                this.towerTeamId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTowerTeamId() {
                this.towerTeamId_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureAvatarGuidListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.avatarGuidList_ = GeneratedMessageV3.mutableCopy(this.avatarGuidList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Long> getAvatarGuidListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Long>)this.avatarGuidList_) : this.avatarGuidList_;
            }
            
            @Override
            public int getAvatarGuidListCount() {
                return this.avatarGuidList_.size();
            }
            
            @Override
            public long getAvatarGuidList(final int index) {
                return this.avatarGuidList_.getLong(index);
            }
            
            public Builder setAvatarGuidList(final int index, final long value) {
                this.ensureAvatarGuidListIsMutable();
                this.avatarGuidList_.setLong(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addAvatarGuidList(final long value) {
                this.ensureAvatarGuidListIsMutable();
                this.avatarGuidList_.addLong(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllAvatarGuidList(final Iterable<? extends Long> values) {
                this.ensureAvatarGuidListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.avatarGuidList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearAvatarGuidList() {
                this.avatarGuidList_ = GeneratedMessageV3.emptyLongList();
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
    
    public interface TowerTeamOrBuilder extends MessageOrBuilder
    {
        int getTowerTeamId();
        
        List<Long> getAvatarGuidListList();
        
        int getAvatarGuidListCount();
        
        long getAvatarGuidList(final int p0);
    }
}
