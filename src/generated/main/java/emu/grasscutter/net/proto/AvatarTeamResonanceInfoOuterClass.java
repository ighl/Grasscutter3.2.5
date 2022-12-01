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

public final class AvatarTeamResonanceInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_AvatarTeamResonanceInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarTeamResonanceInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AvatarTeamResonanceInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AvatarTeamResonanceInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001dAvatarTeamResonanceInfo.proto\"\u0089\u0001\n\u0017AvatarTeamResonanceInfo\u0012\"\n\u001aadd_team_resonance_id_list\u0018\u0005 \u0003(\r\u0012\u0011\n\tentity_id\u0018\u000b \u0001(\r\u0012\u0013\n\u000bavatar_guid\u0018\u0003 \u0001(\u0004\u0012\"\n\u001adel_team_resonance_id_list\u0018\u000e \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AvatarTeamResonanceInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_AvatarTeamResonanceInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AvatarTeamResonanceInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarTeamResonanceInfoOuterClass.internal_static_AvatarTeamResonanceInfo_descriptor, new String[] { "AddTeamResonanceIdList", "EntityId", "AvatarGuid", "DelTeamResonanceIdList" });
    }
    
    public static final class AvatarTeamResonanceInfo extends GeneratedMessageV3 implements AvatarTeamResonanceInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ADD_TEAM_RESONANCE_ID_LIST_FIELD_NUMBER = 5;
        private Internal.IntList addTeamResonanceIdList_;
        private int addTeamResonanceIdListMemoizedSerializedSize;
        public static final int ENTITY_ID_FIELD_NUMBER = 11;
        private int entityId_;
        public static final int AVATAR_GUID_FIELD_NUMBER = 3;
        private long avatarGuid_;
        public static final int DEL_TEAM_RESONANCE_ID_LIST_FIELD_NUMBER = 14;
        private Internal.IntList delTeamResonanceIdList_;
        private int delTeamResonanceIdListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final AvatarTeamResonanceInfo DEFAULT_INSTANCE;
        private static final Parser<AvatarTeamResonanceInfo> PARSER;
        
        private AvatarTeamResonanceInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.addTeamResonanceIdListMemoizedSerializedSize = -1;
            this.delTeamResonanceIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private AvatarTeamResonanceInfo() {
            this.addTeamResonanceIdListMemoizedSerializedSize = -1;
            this.delTeamResonanceIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.addTeamResonanceIdList_ = GeneratedMessageV3.emptyIntList();
            this.delTeamResonanceIdList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AvatarTeamResonanceInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AvatarTeamResonanceInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.avatarGuid_ = input.readUInt64();
                            continue;
                        }
                        case 40: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.addTeamResonanceIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.addTeamResonanceIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 42: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.addTeamResonanceIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.addTeamResonanceIdList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 88: {
                            this.entityId_ = input.readUInt32();
                            continue;
                        }
                        case 112: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.delTeamResonanceIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.delTeamResonanceIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 114: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.delTeamResonanceIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.delTeamResonanceIdList_.addInt(input.readUInt32());
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
                    this.addTeamResonanceIdList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.delTeamResonanceIdList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return AvatarTeamResonanceInfoOuterClass.internal_static_AvatarTeamResonanceInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AvatarTeamResonanceInfoOuterClass.internal_static_AvatarTeamResonanceInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarTeamResonanceInfo.class, Builder.class);
        }
        
        @Override
        public List<Integer> getAddTeamResonanceIdListList() {
            return this.addTeamResonanceIdList_;
        }
        
        @Override
        public int getAddTeamResonanceIdListCount() {
            return this.addTeamResonanceIdList_.size();
        }
        
        @Override
        public int getAddTeamResonanceIdList(final int index) {
            return this.addTeamResonanceIdList_.getInt(index);
        }
        
        @Override
        public int getEntityId() {
            return this.entityId_;
        }
        
        @Override
        public long getAvatarGuid() {
            return this.avatarGuid_;
        }
        
        @Override
        public List<Integer> getDelTeamResonanceIdListList() {
            return this.delTeamResonanceIdList_;
        }
        
        @Override
        public int getDelTeamResonanceIdListCount() {
            return this.delTeamResonanceIdList_.size();
        }
        
        @Override
        public int getDelTeamResonanceIdList(final int index) {
            return this.delTeamResonanceIdList_.getInt(index);
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
            if (this.avatarGuid_ != 0L) {
                output.writeUInt64(3, this.avatarGuid_);
            }
            if (this.getAddTeamResonanceIdListList().size() > 0) {
                output.writeUInt32NoTag(42);
                output.writeUInt32NoTag(this.addTeamResonanceIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.addTeamResonanceIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.addTeamResonanceIdList_.getInt(i));
            }
            if (this.entityId_ != 0) {
                output.writeUInt32(11, this.entityId_);
            }
            if (this.getDelTeamResonanceIdListList().size() > 0) {
                output.writeUInt32NoTag(114);
                output.writeUInt32NoTag(this.delTeamResonanceIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.delTeamResonanceIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.delTeamResonanceIdList_.getInt(i));
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
            if (this.avatarGuid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(3, this.avatarGuid_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.addTeamResonanceIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.addTeamResonanceIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getAddTeamResonanceIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.addTeamResonanceIdListMemoizedSerializedSize = dataSize;
            if (this.entityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.entityId_);
            }
            dataSize = 0;
            for (int i = 0; i < this.delTeamResonanceIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.delTeamResonanceIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getDelTeamResonanceIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.delTeamResonanceIdListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarTeamResonanceInfo)) {
                return super.equals(obj);
            }
            final AvatarTeamResonanceInfo other = (AvatarTeamResonanceInfo)obj;
            return this.getAddTeamResonanceIdListList().equals(other.getAddTeamResonanceIdListList()) && this.getEntityId() == other.getEntityId() && this.getAvatarGuid() == other.getAvatarGuid() && this.getDelTeamResonanceIdListList().equals(other.getDelTeamResonanceIdListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getAddTeamResonanceIdListCount() > 0) {
                hash = 37 * hash + 5;
                hash = 53 * hash + this.getAddTeamResonanceIdListList().hashCode();
            }
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getEntityId();
            hash = 37 * hash + 3;
            hash = 53 * hash + Internal.hashLong(this.getAvatarGuid());
            if (this.getDelTeamResonanceIdListCount() > 0) {
                hash = 37 * hash + 14;
                hash = 53 * hash + this.getDelTeamResonanceIdListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AvatarTeamResonanceInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AvatarTeamResonanceInfo.PARSER.parseFrom(data);
        }
        
        public static AvatarTeamResonanceInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarTeamResonanceInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarTeamResonanceInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AvatarTeamResonanceInfo.PARSER.parseFrom(data);
        }
        
        public static AvatarTeamResonanceInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarTeamResonanceInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarTeamResonanceInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AvatarTeamResonanceInfo.PARSER.parseFrom(data);
        }
        
        public static AvatarTeamResonanceInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarTeamResonanceInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarTeamResonanceInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarTeamResonanceInfo.PARSER, input);
        }
        
        public static AvatarTeamResonanceInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarTeamResonanceInfo.PARSER, input, extensionRegistry);
        }
        
        public static AvatarTeamResonanceInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarTeamResonanceInfo.PARSER, input);
        }
        
        public static AvatarTeamResonanceInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarTeamResonanceInfo.PARSER, input, extensionRegistry);
        }
        
        public static AvatarTeamResonanceInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarTeamResonanceInfo.PARSER, input);
        }
        
        public static AvatarTeamResonanceInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarTeamResonanceInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AvatarTeamResonanceInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AvatarTeamResonanceInfo prototype) {
            return AvatarTeamResonanceInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AvatarTeamResonanceInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AvatarTeamResonanceInfo getDefaultInstance() {
            return AvatarTeamResonanceInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<AvatarTeamResonanceInfo> parser() {
            return AvatarTeamResonanceInfo.PARSER;
        }
        
        @Override
        public Parser<AvatarTeamResonanceInfo> getParserForType() {
            return AvatarTeamResonanceInfo.PARSER;
        }
        
        @Override
        public AvatarTeamResonanceInfo getDefaultInstanceForType() {
            return AvatarTeamResonanceInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AvatarTeamResonanceInfo();
            PARSER = new AbstractParser<AvatarTeamResonanceInfo>() {
                @Override
                public AvatarTeamResonanceInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AvatarTeamResonanceInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AvatarTeamResonanceInfoOrBuilder
        {
            private int bitField0_;
            private Internal.IntList addTeamResonanceIdList_;
            private int entityId_;
            private long avatarGuid_;
            private Internal.IntList delTeamResonanceIdList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AvatarTeamResonanceInfoOuterClass.internal_static_AvatarTeamResonanceInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AvatarTeamResonanceInfoOuterClass.internal_static_AvatarTeamResonanceInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarTeamResonanceInfo.class, Builder.class);
            }
            
            private Builder() {
                this.addTeamResonanceIdList_ = GeneratedMessageV3.emptyIntList();
                this.delTeamResonanceIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.addTeamResonanceIdList_ = GeneratedMessageV3.emptyIntList();
                this.delTeamResonanceIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AvatarTeamResonanceInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.addTeamResonanceIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.entityId_ = 0;
                this.avatarGuid_ = 0L;
                this.delTeamResonanceIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AvatarTeamResonanceInfoOuterClass.internal_static_AvatarTeamResonanceInfo_descriptor;
            }
            
            @Override
            public AvatarTeamResonanceInfo getDefaultInstanceForType() {
                return AvatarTeamResonanceInfo.getDefaultInstance();
            }
            
            @Override
            public AvatarTeamResonanceInfo build() {
                final AvatarTeamResonanceInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AvatarTeamResonanceInfo buildPartial() {
                final AvatarTeamResonanceInfo result = new AvatarTeamResonanceInfo(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.addTeamResonanceIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.addTeamResonanceIdList_ = this.addTeamResonanceIdList_;
                result.entityId_ = this.entityId_;
                result.avatarGuid_ = this.avatarGuid_;
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.delTeamResonanceIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.delTeamResonanceIdList_ = this.delTeamResonanceIdList_;
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
                if (other instanceof AvatarTeamResonanceInfo) {
                    return this.mergeFrom((AvatarTeamResonanceInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AvatarTeamResonanceInfo other) {
                if (other == AvatarTeamResonanceInfo.getDefaultInstance()) {
                    return this;
                }
                if (!other.addTeamResonanceIdList_.isEmpty()) {
                    if (this.addTeamResonanceIdList_.isEmpty()) {
                        this.addTeamResonanceIdList_ = other.addTeamResonanceIdList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureAddTeamResonanceIdListIsMutable();
                        this.addTeamResonanceIdList_.addAll(other.addTeamResonanceIdList_);
                    }
                    this.onChanged();
                }
                if (other.getEntityId() != 0) {
                    this.setEntityId(other.getEntityId());
                }
                if (other.getAvatarGuid() != 0L) {
                    this.setAvatarGuid(other.getAvatarGuid());
                }
                if (!other.delTeamResonanceIdList_.isEmpty()) {
                    if (this.delTeamResonanceIdList_.isEmpty()) {
                        this.delTeamResonanceIdList_ = other.delTeamResonanceIdList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensureDelTeamResonanceIdListIsMutable();
                        this.delTeamResonanceIdList_.addAll(other.delTeamResonanceIdList_);
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
                AvatarTeamResonanceInfo parsedMessage = null;
                try {
                    parsedMessage = AvatarTeamResonanceInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AvatarTeamResonanceInfo)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureAddTeamResonanceIdListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.addTeamResonanceIdList_ = GeneratedMessageV3.mutableCopy(this.addTeamResonanceIdList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getAddTeamResonanceIdListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.addTeamResonanceIdList_) : this.addTeamResonanceIdList_;
            }
            
            @Override
            public int getAddTeamResonanceIdListCount() {
                return this.addTeamResonanceIdList_.size();
            }
            
            @Override
            public int getAddTeamResonanceIdList(final int index) {
                return this.addTeamResonanceIdList_.getInt(index);
            }
            
            public Builder setAddTeamResonanceIdList(final int index, final int value) {
                this.ensureAddTeamResonanceIdListIsMutable();
                this.addTeamResonanceIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addAddTeamResonanceIdList(final int value) {
                this.ensureAddTeamResonanceIdListIsMutable();
                this.addTeamResonanceIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllAddTeamResonanceIdList(final Iterable<? extends Integer> values) {
                this.ensureAddTeamResonanceIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.addTeamResonanceIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearAddTeamResonanceIdList() {
                this.addTeamResonanceIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getEntityId() {
                return this.entityId_;
            }
            
            public Builder setEntityId(final int value) {
                this.entityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEntityId() {
                this.entityId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public long getAvatarGuid() {
                return this.avatarGuid_;
            }
            
            public Builder setAvatarGuid(final long value) {
                this.avatarGuid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAvatarGuid() {
                this.avatarGuid_ = 0L;
                this.onChanged();
                return this;
            }
            
            private void ensureDelTeamResonanceIdListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.delTeamResonanceIdList_ = GeneratedMessageV3.mutableCopy(this.delTeamResonanceIdList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Integer> getDelTeamResonanceIdListList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.delTeamResonanceIdList_) : this.delTeamResonanceIdList_;
            }
            
            @Override
            public int getDelTeamResonanceIdListCount() {
                return this.delTeamResonanceIdList_.size();
            }
            
            @Override
            public int getDelTeamResonanceIdList(final int index) {
                return this.delTeamResonanceIdList_.getInt(index);
            }
            
            public Builder setDelTeamResonanceIdList(final int index, final int value) {
                this.ensureDelTeamResonanceIdListIsMutable();
                this.delTeamResonanceIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addDelTeamResonanceIdList(final int value) {
                this.ensureDelTeamResonanceIdListIsMutable();
                this.delTeamResonanceIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllDelTeamResonanceIdList(final Iterable<? extends Integer> values) {
                this.ensureDelTeamResonanceIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.delTeamResonanceIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearDelTeamResonanceIdList() {
                this.delTeamResonanceIdList_ = GeneratedMessageV3.emptyIntList();
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
    
    public interface AvatarTeamResonanceInfoOrBuilder extends MessageOrBuilder
    {
        List<Integer> getAddTeamResonanceIdListList();
        
        int getAddTeamResonanceIdListCount();
        
        int getAddTeamResonanceIdList(final int p0);
        
        int getEntityId();
        
        long getAvatarGuid();
        
        List<Integer> getDelTeamResonanceIdListList();
        
        int getDelTeamResonanceIdListCount();
        
        int getDelTeamResonanceIdList(final int p0);
    }
}
