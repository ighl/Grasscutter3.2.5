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

public final class DungeonChallengeBeginNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_DungeonChallengeBeginNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_DungeonChallengeBeginNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private DungeonChallengeBeginNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return DungeonChallengeBeginNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n!DungeonChallengeBeginNotify.proto\"\u009a\u0001\n\u001bDungeonChallengeBeginNotify\u0012\u0014\n\ffather_index\u0018\u0005 \u0001(\r\u0012\u0012\n\nparam_list\u0018\u000e \u0003(\r\u0012\u0017\n\u000fchallenge_index\u0018\u0006 \u0001(\r\u0012\u0014\n\fchallenge_id\u0018\u0001 \u0001(\r\u0012\u0010\n\bgroup_id\u0018\u0004 \u0001(\r\u0012\u0010\n\buid_list\u0018\f \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        DungeonChallengeBeginNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_DungeonChallengeBeginNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_DungeonChallengeBeginNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(DungeonChallengeBeginNotifyOuterClass.internal_static_DungeonChallengeBeginNotify_descriptor, new String[] { "FatherIndex", "ParamList", "ChallengeIndex", "ChallengeId", "GroupId", "UidList" });
    }
    
    public static final class DungeonChallengeBeginNotify extends GeneratedMessageV3 implements DungeonChallengeBeginNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int FATHER_INDEX_FIELD_NUMBER = 5;
        private int fatherIndex_;
        public static final int PARAM_LIST_FIELD_NUMBER = 14;
        private Internal.IntList paramList_;
        private int paramListMemoizedSerializedSize;
        public static final int CHALLENGE_INDEX_FIELD_NUMBER = 6;
        private int challengeIndex_;
        public static final int CHALLENGE_ID_FIELD_NUMBER = 1;
        private int challengeId_;
        public static final int GROUP_ID_FIELD_NUMBER = 4;
        private int groupId_;
        public static final int UID_LIST_FIELD_NUMBER = 12;
        private Internal.IntList uidList_;
        private int uidListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final DungeonChallengeBeginNotify DEFAULT_INSTANCE;
        private static final Parser<DungeonChallengeBeginNotify> PARSER;
        
        private DungeonChallengeBeginNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.paramListMemoizedSerializedSize = -1;
            this.uidListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private DungeonChallengeBeginNotify() {
            this.paramListMemoizedSerializedSize = -1;
            this.uidListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.paramList_ = GeneratedMessageV3.emptyIntList();
            this.uidList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new DungeonChallengeBeginNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private DungeonChallengeBeginNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 8: {
                            this.challengeId_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            this.groupId_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            this.fatherIndex_ = input.readUInt32();
                            continue;
                        }
                        case 48: {
                            this.challengeIndex_ = input.readUInt32();
                            continue;
                        }
                        case 96: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.uidList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.uidList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 98: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.uidList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.uidList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 112: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.paramList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.paramList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 114: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.paramList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.paramList_.addInt(input.readUInt32());
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
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.uidList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.paramList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return DungeonChallengeBeginNotifyOuterClass.internal_static_DungeonChallengeBeginNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return DungeonChallengeBeginNotifyOuterClass.internal_static_DungeonChallengeBeginNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(DungeonChallengeBeginNotify.class, Builder.class);
        }
        
        @Override
        public int getFatherIndex() {
            return this.fatherIndex_;
        }
        
        @Override
        public List<Integer> getParamListList() {
            return this.paramList_;
        }
        
        @Override
        public int getParamListCount() {
            return this.paramList_.size();
        }
        
        @Override
        public int getParamList(final int index) {
            return this.paramList_.getInt(index);
        }
        
        @Override
        public int getChallengeIndex() {
            return this.challengeIndex_;
        }
        
        @Override
        public int getChallengeId() {
            return this.challengeId_;
        }
        
        @Override
        public int getGroupId() {
            return this.groupId_;
        }
        
        @Override
        public List<Integer> getUidListList() {
            return this.uidList_;
        }
        
        @Override
        public int getUidListCount() {
            return this.uidList_.size();
        }
        
        @Override
        public int getUidList(final int index) {
            return this.uidList_.getInt(index);
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
            if (this.challengeId_ != 0) {
                output.writeUInt32(1, this.challengeId_);
            }
            if (this.groupId_ != 0) {
                output.writeUInt32(4, this.groupId_);
            }
            if (this.fatherIndex_ != 0) {
                output.writeUInt32(5, this.fatherIndex_);
            }
            if (this.challengeIndex_ != 0) {
                output.writeUInt32(6, this.challengeIndex_);
            }
            if (this.getUidListList().size() > 0) {
                output.writeUInt32NoTag(98);
                output.writeUInt32NoTag(this.uidListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.uidList_.size(); ++i) {
                output.writeUInt32NoTag(this.uidList_.getInt(i));
            }
            if (this.getParamListList().size() > 0) {
                output.writeUInt32NoTag(114);
                output.writeUInt32NoTag(this.paramListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.paramList_.size(); ++i) {
                output.writeUInt32NoTag(this.paramList_.getInt(i));
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
            if (this.challengeId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.challengeId_);
            }
            if (this.groupId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.groupId_);
            }
            if (this.fatherIndex_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.fatherIndex_);
            }
            if (this.challengeIndex_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.challengeIndex_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.uidList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.uidList_.getInt(i));
            }
            size += dataSize;
            if (!this.getUidListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.uidListMemoizedSerializedSize = dataSize;
            dataSize = 0;
            for (int i = 0; i < this.paramList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.paramList_.getInt(i));
            }
            size += dataSize;
            if (!this.getParamListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.paramListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DungeonChallengeBeginNotify)) {
                return super.equals(obj);
            }
            final DungeonChallengeBeginNotify other = (DungeonChallengeBeginNotify)obj;
            return this.getFatherIndex() == other.getFatherIndex() && this.getParamListList().equals(other.getParamListList()) && this.getChallengeIndex() == other.getChallengeIndex() && this.getChallengeId() == other.getChallengeId() && this.getGroupId() == other.getGroupId() && this.getUidListList().equals(other.getUidListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getFatherIndex();
            if (this.getParamListCount() > 0) {
                hash = 37 * hash + 14;
                hash = 53 * hash + this.getParamListList().hashCode();
            }
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getChallengeIndex();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getChallengeId();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getGroupId();
            if (this.getUidListCount() > 0) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.getUidListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static DungeonChallengeBeginNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return DungeonChallengeBeginNotify.PARSER.parseFrom(data);
        }
        
        public static DungeonChallengeBeginNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DungeonChallengeBeginNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DungeonChallengeBeginNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return DungeonChallengeBeginNotify.PARSER.parseFrom(data);
        }
        
        public static DungeonChallengeBeginNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DungeonChallengeBeginNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DungeonChallengeBeginNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return DungeonChallengeBeginNotify.PARSER.parseFrom(data);
        }
        
        public static DungeonChallengeBeginNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DungeonChallengeBeginNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DungeonChallengeBeginNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DungeonChallengeBeginNotify.PARSER, input);
        }
        
        public static DungeonChallengeBeginNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DungeonChallengeBeginNotify.PARSER, input, extensionRegistry);
        }
        
        public static DungeonChallengeBeginNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(DungeonChallengeBeginNotify.PARSER, input);
        }
        
        public static DungeonChallengeBeginNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(DungeonChallengeBeginNotify.PARSER, input, extensionRegistry);
        }
        
        public static DungeonChallengeBeginNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DungeonChallengeBeginNotify.PARSER, input);
        }
        
        public static DungeonChallengeBeginNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DungeonChallengeBeginNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return DungeonChallengeBeginNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final DungeonChallengeBeginNotify prototype) {
            return DungeonChallengeBeginNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == DungeonChallengeBeginNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static DungeonChallengeBeginNotify getDefaultInstance() {
            return DungeonChallengeBeginNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<DungeonChallengeBeginNotify> parser() {
            return DungeonChallengeBeginNotify.PARSER;
        }
        
        @Override
        public Parser<DungeonChallengeBeginNotify> getParserForType() {
            return DungeonChallengeBeginNotify.PARSER;
        }
        
        @Override
        public DungeonChallengeBeginNotify getDefaultInstanceForType() {
            return DungeonChallengeBeginNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new DungeonChallengeBeginNotify();
            PARSER = new AbstractParser<DungeonChallengeBeginNotify>() {
                @Override
                public DungeonChallengeBeginNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new DungeonChallengeBeginNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DungeonChallengeBeginNotifyOrBuilder
        {
            private int bitField0_;
            private int fatherIndex_;
            private Internal.IntList paramList_;
            private int challengeIndex_;
            private int challengeId_;
            private int groupId_;
            private Internal.IntList uidList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return DungeonChallengeBeginNotifyOuterClass.internal_static_DungeonChallengeBeginNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return DungeonChallengeBeginNotifyOuterClass.internal_static_DungeonChallengeBeginNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(DungeonChallengeBeginNotify.class, Builder.class);
            }
            
            private Builder() {
                this.paramList_ = GeneratedMessageV3.emptyIntList();
                this.uidList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.paramList_ = GeneratedMessageV3.emptyIntList();
                this.uidList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (DungeonChallengeBeginNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.fatherIndex_ = 0;
                this.paramList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.challengeIndex_ = 0;
                this.challengeId_ = 0;
                this.groupId_ = 0;
                this.uidList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return DungeonChallengeBeginNotifyOuterClass.internal_static_DungeonChallengeBeginNotify_descriptor;
            }
            
            @Override
            public DungeonChallengeBeginNotify getDefaultInstanceForType() {
                return DungeonChallengeBeginNotify.getDefaultInstance();
            }
            
            @Override
            public DungeonChallengeBeginNotify build() {
                final DungeonChallengeBeginNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public DungeonChallengeBeginNotify buildPartial() {
                final DungeonChallengeBeginNotify result = new DungeonChallengeBeginNotify(this);
                final int from_bitField0_ = this.bitField0_;
                result.fatherIndex_ = this.fatherIndex_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.paramList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.paramList_ = this.paramList_;
                result.challengeIndex_ = this.challengeIndex_;
                result.challengeId_ = this.challengeId_;
                result.groupId_ = this.groupId_;
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.uidList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.uidList_ = this.uidList_;
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
                if (other instanceof DungeonChallengeBeginNotify) {
                    return this.mergeFrom((DungeonChallengeBeginNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final DungeonChallengeBeginNotify other) {
                if (other == DungeonChallengeBeginNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getFatherIndex() != 0) {
                    this.setFatherIndex(other.getFatherIndex());
                }
                if (!other.paramList_.isEmpty()) {
                    if (this.paramList_.isEmpty()) {
                        this.paramList_ = other.paramList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureParamListIsMutable();
                        this.paramList_.addAll(other.paramList_);
                    }
                    this.onChanged();
                }
                if (other.getChallengeIndex() != 0) {
                    this.setChallengeIndex(other.getChallengeIndex());
                }
                if (other.getChallengeId() != 0) {
                    this.setChallengeId(other.getChallengeId());
                }
                if (other.getGroupId() != 0) {
                    this.setGroupId(other.getGroupId());
                }
                if (!other.uidList_.isEmpty()) {
                    if (this.uidList_.isEmpty()) {
                        this.uidList_ = other.uidList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensureUidListIsMutable();
                        this.uidList_.addAll(other.uidList_);
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
                DungeonChallengeBeginNotify parsedMessage = null;
                try {
                    parsedMessage = DungeonChallengeBeginNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (DungeonChallengeBeginNotify)e.getUnfinishedMessage();
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
            public int getFatherIndex() {
                return this.fatherIndex_;
            }
            
            public Builder setFatherIndex(final int value) {
                this.fatherIndex_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearFatherIndex() {
                this.fatherIndex_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureParamListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.paramList_ = GeneratedMessageV3.mutableCopy(this.paramList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getParamListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.paramList_) : this.paramList_;
            }
            
            @Override
            public int getParamListCount() {
                return this.paramList_.size();
            }
            
            @Override
            public int getParamList(final int index) {
                return this.paramList_.getInt(index);
            }
            
            public Builder setParamList(final int index, final int value) {
                this.ensureParamListIsMutable();
                this.paramList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addParamList(final int value) {
                this.ensureParamListIsMutable();
                this.paramList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllParamList(final Iterable<? extends Integer> values) {
                this.ensureParamListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.paramList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearParamList() {
                this.paramList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getChallengeIndex() {
                return this.challengeIndex_;
            }
            
            public Builder setChallengeIndex(final int value) {
                this.challengeIndex_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearChallengeIndex() {
                this.challengeIndex_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getChallengeId() {
                return this.challengeId_;
            }
            
            public Builder setChallengeId(final int value) {
                this.challengeId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearChallengeId() {
                this.challengeId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getGroupId() {
                return this.groupId_;
            }
            
            public Builder setGroupId(final int value) {
                this.groupId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGroupId() {
                this.groupId_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureUidListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.uidList_ = GeneratedMessageV3.mutableCopy(this.uidList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Integer> getUidListList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.uidList_) : this.uidList_;
            }
            
            @Override
            public int getUidListCount() {
                return this.uidList_.size();
            }
            
            @Override
            public int getUidList(final int index) {
                return this.uidList_.getInt(index);
            }
            
            public Builder setUidList(final int index, final int value) {
                this.ensureUidListIsMutable();
                this.uidList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addUidList(final int value) {
                this.ensureUidListIsMutable();
                this.uidList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllUidList(final Iterable<? extends Integer> values) {
                this.ensureUidListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.uidList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearUidList() {
                this.uidList_ = GeneratedMessageV3.emptyIntList();
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
    
    public interface DungeonChallengeBeginNotifyOrBuilder extends MessageOrBuilder
    {
        int getFatherIndex();
        
        List<Integer> getParamListList();
        
        int getParamListCount();
        
        int getParamList(final int p0);
        
        int getChallengeIndex();
        
        int getChallengeId();
        
        int getGroupId();
        
        List<Integer> getUidListList();
        
        int getUidListCount();
        
        int getUidList(final int p0);
    }
}
