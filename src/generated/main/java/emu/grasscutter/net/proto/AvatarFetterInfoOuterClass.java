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
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class AvatarFetterInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_AvatarFetterInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarFetterInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AvatarFetterInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AvatarFetterInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016AvatarFetterInfo.proto\u001a\u0010FetterData.proto\"\u00ad\u0001\n\u0010AvatarFetterInfo\u0012\u0012\n\nexp_number\u0018\u0001 \u0001(\r\u0012\u0011\n\texp_level\u0018\u0002 \u0001(\r\u0012\u0014\n\fopen_id_list\u0018\u0003 \u0003(\r\u0012\u0016\n\u000efinish_id_list\u0018\u0004 \u0003(\r\u0012\"\n\u001arewarded_fetter_level_list\u0018\u0005 \u0003(\r\u0012 \n\u000bfetter_list\u0018\u0006 \u0003(\u000b2\u000b.FetterDataB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AvatarFetterInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { FetterDataOuterClass.getDescriptor() });
        internal_static_AvatarFetterInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AvatarFetterInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarFetterInfoOuterClass.internal_static_AvatarFetterInfo_descriptor, new String[] { "ExpNumber", "ExpLevel", "OpenIdList", "FinishIdList", "RewardedFetterLevelList", "FetterList" });
        FetterDataOuterClass.getDescriptor();
    }
    
    public static final class AvatarFetterInfo extends GeneratedMessageV3 implements AvatarFetterInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int EXP_NUMBER_FIELD_NUMBER = 1;
        private int expNumber_;
        public static final int EXP_LEVEL_FIELD_NUMBER = 2;
        private int expLevel_;
        public static final int OPEN_ID_LIST_FIELD_NUMBER = 3;
        private Internal.IntList openIdList_;
        private int openIdListMemoizedSerializedSize;
        public static final int FINISH_ID_LIST_FIELD_NUMBER = 4;
        private Internal.IntList finishIdList_;
        private int finishIdListMemoizedSerializedSize;
        public static final int REWARDED_FETTER_LEVEL_LIST_FIELD_NUMBER = 5;
        private Internal.IntList rewardedFetterLevelList_;
        private int rewardedFetterLevelListMemoizedSerializedSize;
        public static final int FETTER_LIST_FIELD_NUMBER = 6;
        private List<FetterDataOuterClass.FetterData> fetterList_;
        private byte memoizedIsInitialized;
        private static final AvatarFetterInfo DEFAULT_INSTANCE;
        private static final Parser<AvatarFetterInfo> PARSER;
        
        private AvatarFetterInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.openIdListMemoizedSerializedSize = -1;
            this.finishIdListMemoizedSerializedSize = -1;
            this.rewardedFetterLevelListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private AvatarFetterInfo() {
            this.openIdListMemoizedSerializedSize = -1;
            this.finishIdListMemoizedSerializedSize = -1;
            this.rewardedFetterLevelListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.openIdList_ = GeneratedMessageV3.emptyIntList();
            this.finishIdList_ = GeneratedMessageV3.emptyIntList();
            this.rewardedFetterLevelList_ = GeneratedMessageV3.emptyIntList();
            this.fetterList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AvatarFetterInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AvatarFetterInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.expNumber_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.expLevel_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.openIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.openIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 26: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.openIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.openIdList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 32: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.finishIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.finishIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 34: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.finishIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.finishIdList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 40: {
                            if ((mutable_bitField0_ & 0x4) == 0x0) {
                                this.rewardedFetterLevelList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.rewardedFetterLevelList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 42: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x4) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.rewardedFetterLevelList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x4;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.rewardedFetterLevelList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 50: {
                            if ((mutable_bitField0_ & 0x8) == 0x0) {
                                this.fetterList_ = new ArrayList<FetterDataOuterClass.FetterData>();
                                mutable_bitField0_ |= 0x8;
                            }
                            this.fetterList_.add(input.readMessage(FetterDataOuterClass.FetterData.parser(), extensionRegistry));
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
                    this.openIdList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.finishIdList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x4) != 0x0) {
                    this.rewardedFetterLevelList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x8) != 0x0) {
                    this.fetterList_ = Collections.unmodifiableList((List<? extends FetterDataOuterClass.FetterData>)this.fetterList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return AvatarFetterInfoOuterClass.internal_static_AvatarFetterInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AvatarFetterInfoOuterClass.internal_static_AvatarFetterInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarFetterInfo.class, Builder.class);
        }
        
        @Override
        public int getExpNumber() {
            return this.expNumber_;
        }
        
        @Override
        public int getExpLevel() {
            return this.expLevel_;
        }
        
        @Override
        public List<Integer> getOpenIdListList() {
            return this.openIdList_;
        }
        
        @Override
        public int getOpenIdListCount() {
            return this.openIdList_.size();
        }
        
        @Override
        public int getOpenIdList(final int index) {
            return this.openIdList_.getInt(index);
        }
        
        @Override
        public List<Integer> getFinishIdListList() {
            return this.finishIdList_;
        }
        
        @Override
        public int getFinishIdListCount() {
            return this.finishIdList_.size();
        }
        
        @Override
        public int getFinishIdList(final int index) {
            return this.finishIdList_.getInt(index);
        }
        
        @Override
        public List<Integer> getRewardedFetterLevelListList() {
            return this.rewardedFetterLevelList_;
        }
        
        @Override
        public int getRewardedFetterLevelListCount() {
            return this.rewardedFetterLevelList_.size();
        }
        
        @Override
        public int getRewardedFetterLevelList(final int index) {
            return this.rewardedFetterLevelList_.getInt(index);
        }
        
        @Override
        public List<FetterDataOuterClass.FetterData> getFetterListList() {
            return this.fetterList_;
        }
        
        @Override
        public List<? extends FetterDataOuterClass.FetterDataOrBuilder> getFetterListOrBuilderList() {
            return this.fetterList_;
        }
        
        @Override
        public int getFetterListCount() {
            return this.fetterList_.size();
        }
        
        @Override
        public FetterDataOuterClass.FetterData getFetterList(final int index) {
            return this.fetterList_.get(index);
        }
        
        @Override
        public FetterDataOuterClass.FetterDataOrBuilder getFetterListOrBuilder(final int index) {
            return this.fetterList_.get(index);
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
            if (this.expNumber_ != 0) {
                output.writeUInt32(1, this.expNumber_);
            }
            if (this.expLevel_ != 0) {
                output.writeUInt32(2, this.expLevel_);
            }
            if (this.getOpenIdListList().size() > 0) {
                output.writeUInt32NoTag(26);
                output.writeUInt32NoTag(this.openIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.openIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.openIdList_.getInt(i));
            }
            if (this.getFinishIdListList().size() > 0) {
                output.writeUInt32NoTag(34);
                output.writeUInt32NoTag(this.finishIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.finishIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.finishIdList_.getInt(i));
            }
            if (this.getRewardedFetterLevelListList().size() > 0) {
                output.writeUInt32NoTag(42);
                output.writeUInt32NoTag(this.rewardedFetterLevelListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.rewardedFetterLevelList_.size(); ++i) {
                output.writeUInt32NoTag(this.rewardedFetterLevelList_.getInt(i));
            }
            for (int i = 0; i < this.fetterList_.size(); ++i) {
                output.writeMessage(6, this.fetterList_.get(i));
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
            if (this.expNumber_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.expNumber_);
            }
            if (this.expLevel_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.expLevel_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.openIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.openIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getOpenIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.openIdListMemoizedSerializedSize = dataSize;
            dataSize = 0;
            for (int i = 0; i < this.finishIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.finishIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getFinishIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.finishIdListMemoizedSerializedSize = dataSize;
            dataSize = 0;
            for (int i = 0; i < this.rewardedFetterLevelList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.rewardedFetterLevelList_.getInt(i));
            }
            size += dataSize;
            if (!this.getRewardedFetterLevelListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.rewardedFetterLevelListMemoizedSerializedSize = dataSize;
            for (int j = 0; j < this.fetterList_.size(); ++j) {
                size += CodedOutputStream.computeMessageSize(6, this.fetterList_.get(j));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarFetterInfo)) {
                return super.equals(obj);
            }
            final AvatarFetterInfo other = (AvatarFetterInfo)obj;
            return this.getExpNumber() == other.getExpNumber() && this.getExpLevel() == other.getExpLevel() && this.getOpenIdListList().equals(other.getOpenIdListList()) && this.getFinishIdListList().equals(other.getFinishIdListList()) && this.getRewardedFetterLevelListList().equals(other.getRewardedFetterLevelListList()) && this.getFetterListList().equals(other.getFetterListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getExpNumber();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getExpLevel();
            if (this.getOpenIdListCount() > 0) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getOpenIdListList().hashCode();
            }
            if (this.getFinishIdListCount() > 0) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.getFinishIdListList().hashCode();
            }
            if (this.getRewardedFetterLevelListCount() > 0) {
                hash = 37 * hash + 5;
                hash = 53 * hash + this.getRewardedFetterLevelListList().hashCode();
            }
            if (this.getFetterListCount() > 0) {
                hash = 37 * hash + 6;
                hash = 53 * hash + this.getFetterListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AvatarFetterInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AvatarFetterInfo.PARSER.parseFrom(data);
        }
        
        public static AvatarFetterInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarFetterInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarFetterInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AvatarFetterInfo.PARSER.parseFrom(data);
        }
        
        public static AvatarFetterInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarFetterInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarFetterInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AvatarFetterInfo.PARSER.parseFrom(data);
        }
        
        public static AvatarFetterInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarFetterInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarFetterInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarFetterInfo.PARSER, input);
        }
        
        public static AvatarFetterInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarFetterInfo.PARSER, input, extensionRegistry);
        }
        
        public static AvatarFetterInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarFetterInfo.PARSER, input);
        }
        
        public static AvatarFetterInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarFetterInfo.PARSER, input, extensionRegistry);
        }
        
        public static AvatarFetterInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarFetterInfo.PARSER, input);
        }
        
        public static AvatarFetterInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarFetterInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AvatarFetterInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AvatarFetterInfo prototype) {
            return AvatarFetterInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AvatarFetterInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AvatarFetterInfo getDefaultInstance() {
            return AvatarFetterInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<AvatarFetterInfo> parser() {
            return AvatarFetterInfo.PARSER;
        }
        
        @Override
        public Parser<AvatarFetterInfo> getParserForType() {
            return AvatarFetterInfo.PARSER;
        }
        
        @Override
        public AvatarFetterInfo getDefaultInstanceForType() {
            return AvatarFetterInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AvatarFetterInfo();
            PARSER = new AbstractParser<AvatarFetterInfo>() {
                @Override
                public AvatarFetterInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AvatarFetterInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AvatarFetterInfoOrBuilder
        {
            private int bitField0_;
            private int expNumber_;
            private int expLevel_;
            private Internal.IntList openIdList_;
            private Internal.IntList finishIdList_;
            private Internal.IntList rewardedFetterLevelList_;
            private List<FetterDataOuterClass.FetterData> fetterList_;
            private RepeatedFieldBuilderV3<FetterDataOuterClass.FetterData, FetterDataOuterClass.FetterData.Builder, FetterDataOuterClass.FetterDataOrBuilder> fetterListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AvatarFetterInfoOuterClass.internal_static_AvatarFetterInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AvatarFetterInfoOuterClass.internal_static_AvatarFetterInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarFetterInfo.class, Builder.class);
            }
            
            private Builder() {
                this.openIdList_ = GeneratedMessageV3.emptyIntList();
                this.finishIdList_ = GeneratedMessageV3.emptyIntList();
                this.rewardedFetterLevelList_ = GeneratedMessageV3.emptyIntList();
                this.fetterList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.openIdList_ = GeneratedMessageV3.emptyIntList();
                this.finishIdList_ = GeneratedMessageV3.emptyIntList();
                this.rewardedFetterLevelList_ = GeneratedMessageV3.emptyIntList();
                this.fetterList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AvatarFetterInfo.alwaysUseFieldBuilders) {
                    this.getFetterListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.expNumber_ = 0;
                this.expLevel_ = 0;
                this.openIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.finishIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.rewardedFetterLevelList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFB;
                if (this.fetterListBuilder_ == null) {
                    this.fetterList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFF7;
                }
                else {
                    this.fetterListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AvatarFetterInfoOuterClass.internal_static_AvatarFetterInfo_descriptor;
            }
            
            @Override
            public AvatarFetterInfo getDefaultInstanceForType() {
                return AvatarFetterInfo.getDefaultInstance();
            }
            
            @Override
            public AvatarFetterInfo build() {
                final AvatarFetterInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AvatarFetterInfo buildPartial() {
                final AvatarFetterInfo result = new AvatarFetterInfo(this);
                final int from_bitField0_ = this.bitField0_;
                result.expNumber_ = this.expNumber_;
                result.expLevel_ = this.expLevel_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.openIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.openIdList_ = this.openIdList_;
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.finishIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.finishIdList_ = this.finishIdList_;
                if ((this.bitField0_ & 0x4) != 0x0) {
                    this.rewardedFetterLevelList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFB;
                }
                result.rewardedFetterLevelList_ = this.rewardedFetterLevelList_;
                if (this.fetterListBuilder_ == null) {
                    if ((this.bitField0_ & 0x8) != 0x0) {
                        this.fetterList_ = Collections.unmodifiableList((List<? extends FetterDataOuterClass.FetterData>)this.fetterList_);
                        this.bitField0_ &= 0xFFFFFFF7;
                    }
                    result.fetterList_ = this.fetterList_;
                }
                else {
                    result.fetterList_ = this.fetterListBuilder_.build();
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
                if (other instanceof AvatarFetterInfo) {
                    return this.mergeFrom((AvatarFetterInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AvatarFetterInfo other) {
                if (other == AvatarFetterInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getExpNumber() != 0) {
                    this.setExpNumber(other.getExpNumber());
                }
                if (other.getExpLevel() != 0) {
                    this.setExpLevel(other.getExpLevel());
                }
                if (!other.openIdList_.isEmpty()) {
                    if (this.openIdList_.isEmpty()) {
                        this.openIdList_ = other.openIdList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureOpenIdListIsMutable();
                        this.openIdList_.addAll(other.openIdList_);
                    }
                    this.onChanged();
                }
                if (!other.finishIdList_.isEmpty()) {
                    if (this.finishIdList_.isEmpty()) {
                        this.finishIdList_ = other.finishIdList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensureFinishIdListIsMutable();
                        this.finishIdList_.addAll(other.finishIdList_);
                    }
                    this.onChanged();
                }
                if (!other.rewardedFetterLevelList_.isEmpty()) {
                    if (this.rewardedFetterLevelList_.isEmpty()) {
                        this.rewardedFetterLevelList_ = other.rewardedFetterLevelList_;
                        this.bitField0_ &= 0xFFFFFFFB;
                    }
                    else {
                        this.ensureRewardedFetterLevelListIsMutable();
                        this.rewardedFetterLevelList_.addAll(other.rewardedFetterLevelList_);
                    }
                    this.onChanged();
                }
                if (this.fetterListBuilder_ == null) {
                    if (!other.fetterList_.isEmpty()) {
                        if (this.fetterList_.isEmpty()) {
                            this.fetterList_ = other.fetterList_;
                            this.bitField0_ &= 0xFFFFFFF7;
                        }
                        else {
                            this.ensureFetterListIsMutable();
                            this.fetterList_.addAll(other.fetterList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.fetterList_.isEmpty()) {
                    if (this.fetterListBuilder_.isEmpty()) {
                        this.fetterListBuilder_.dispose();
                        this.fetterListBuilder_ = null;
                        this.fetterList_ = other.fetterList_;
                        this.bitField0_ &= 0xFFFFFFF7;
                        this.fetterListBuilder_ = (AvatarFetterInfo.alwaysUseFieldBuilders ? this.getFetterListFieldBuilder() : null);
                    }
                    else {
                        this.fetterListBuilder_.addAllMessages(other.fetterList_);
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
                AvatarFetterInfo parsedMessage = null;
                try {
                    parsedMessage = AvatarFetterInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AvatarFetterInfo)e.getUnfinishedMessage();
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
            public int getExpNumber() {
                return this.expNumber_;
            }
            
            public Builder setExpNumber(final int value) {
                this.expNumber_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearExpNumber() {
                this.expNumber_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getExpLevel() {
                return this.expLevel_;
            }
            
            public Builder setExpLevel(final int value) {
                this.expLevel_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearExpLevel() {
                this.expLevel_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureOpenIdListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.openIdList_ = GeneratedMessageV3.mutableCopy(this.openIdList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getOpenIdListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.openIdList_) : this.openIdList_;
            }
            
            @Override
            public int getOpenIdListCount() {
                return this.openIdList_.size();
            }
            
            @Override
            public int getOpenIdList(final int index) {
                return this.openIdList_.getInt(index);
            }
            
            public Builder setOpenIdList(final int index, final int value) {
                this.ensureOpenIdListIsMutable();
                this.openIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addOpenIdList(final int value) {
                this.ensureOpenIdListIsMutable();
                this.openIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllOpenIdList(final Iterable<? extends Integer> values) {
                this.ensureOpenIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.openIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearOpenIdList() {
                this.openIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            private void ensureFinishIdListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.finishIdList_ = GeneratedMessageV3.mutableCopy(this.finishIdList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Integer> getFinishIdListList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.finishIdList_) : this.finishIdList_;
            }
            
            @Override
            public int getFinishIdListCount() {
                return this.finishIdList_.size();
            }
            
            @Override
            public int getFinishIdList(final int index) {
                return this.finishIdList_.getInt(index);
            }
            
            public Builder setFinishIdList(final int index, final int value) {
                this.ensureFinishIdListIsMutable();
                this.finishIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addFinishIdList(final int value) {
                this.ensureFinishIdListIsMutable();
                this.finishIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllFinishIdList(final Iterable<? extends Integer> values) {
                this.ensureFinishIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.finishIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearFinishIdList() {
                this.finishIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.onChanged();
                return this;
            }
            
            private void ensureRewardedFetterLevelListIsMutable() {
                if ((this.bitField0_ & 0x4) == 0x0) {
                    this.rewardedFetterLevelList_ = GeneratedMessageV3.mutableCopy(this.rewardedFetterLevelList_);
                    this.bitField0_ |= 0x4;
                }
            }
            
            @Override
            public List<Integer> getRewardedFetterLevelListList() {
                return ((this.bitField0_ & 0x4) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.rewardedFetterLevelList_) : this.rewardedFetterLevelList_;
            }
            
            @Override
            public int getRewardedFetterLevelListCount() {
                return this.rewardedFetterLevelList_.size();
            }
            
            @Override
            public int getRewardedFetterLevelList(final int index) {
                return this.rewardedFetterLevelList_.getInt(index);
            }
            
            public Builder setRewardedFetterLevelList(final int index, final int value) {
                this.ensureRewardedFetterLevelListIsMutable();
                this.rewardedFetterLevelList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addRewardedFetterLevelList(final int value) {
                this.ensureRewardedFetterLevelListIsMutable();
                this.rewardedFetterLevelList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllRewardedFetterLevelList(final Iterable<? extends Integer> values) {
                this.ensureRewardedFetterLevelListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.rewardedFetterLevelList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearRewardedFetterLevelList() {
                this.rewardedFetterLevelList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFB;
                this.onChanged();
                return this;
            }
            
            private void ensureFetterListIsMutable() {
                if ((this.bitField0_ & 0x8) == 0x0) {
                    this.fetterList_ = new ArrayList<FetterDataOuterClass.FetterData>(this.fetterList_);
                    this.bitField0_ |= 0x8;
                }
            }
            
            @Override
            public List<FetterDataOuterClass.FetterData> getFetterListList() {
                if (this.fetterListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends FetterDataOuterClass.FetterData>)this.fetterList_);
                }
                return this.fetterListBuilder_.getMessageList();
            }
            
            @Override
            public int getFetterListCount() {
                if (this.fetterListBuilder_ == null) {
                    return this.fetterList_.size();
                }
                return this.fetterListBuilder_.getCount();
            }
            
            @Override
            public FetterDataOuterClass.FetterData getFetterList(final int index) {
                if (this.fetterListBuilder_ == null) {
                    return this.fetterList_.get(index);
                }
                return this.fetterListBuilder_.getMessage(index);
            }
            
            public Builder setFetterList(final int index, final FetterDataOuterClass.FetterData value) {
                if (this.fetterListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureFetterListIsMutable();
                    this.fetterList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.fetterListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setFetterList(final int index, final FetterDataOuterClass.FetterData.Builder builderForValue) {
                if (this.fetterListBuilder_ == null) {
                    this.ensureFetterListIsMutable();
                    this.fetterList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.fetterListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addFetterList(final FetterDataOuterClass.FetterData value) {
                if (this.fetterListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureFetterListIsMutable();
                    this.fetterList_.add(value);
                    this.onChanged();
                }
                else {
                    this.fetterListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addFetterList(final int index, final FetterDataOuterClass.FetterData value) {
                if (this.fetterListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureFetterListIsMutable();
                    this.fetterList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.fetterListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addFetterList(final FetterDataOuterClass.FetterData.Builder builderForValue) {
                if (this.fetterListBuilder_ == null) {
                    this.ensureFetterListIsMutable();
                    this.fetterList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.fetterListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addFetterList(final int index, final FetterDataOuterClass.FetterData.Builder builderForValue) {
                if (this.fetterListBuilder_ == null) {
                    this.ensureFetterListIsMutable();
                    this.fetterList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.fetterListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllFetterList(final Iterable<? extends FetterDataOuterClass.FetterData> values) {
                if (this.fetterListBuilder_ == null) {
                    this.ensureFetterListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.fetterList_);
                    this.onChanged();
                }
                else {
                    this.fetterListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearFetterList() {
                if (this.fetterListBuilder_ == null) {
                    this.fetterList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFF7;
                    this.onChanged();
                }
                else {
                    this.fetterListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeFetterList(final int index) {
                if (this.fetterListBuilder_ == null) {
                    this.ensureFetterListIsMutable();
                    this.fetterList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.fetterListBuilder_.remove(index);
                }
                return this;
            }
            
            public FetterDataOuterClass.FetterData.Builder getFetterListBuilder(final int index) {
                return this.getFetterListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public FetterDataOuterClass.FetterDataOrBuilder getFetterListOrBuilder(final int index) {
                if (this.fetterListBuilder_ == null) {
                    return this.fetterList_.get(index);
                }
                return this.fetterListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends FetterDataOuterClass.FetterDataOrBuilder> getFetterListOrBuilderList() {
                if (this.fetterListBuilder_ != null) {
                    return this.fetterListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends FetterDataOuterClass.FetterDataOrBuilder>)this.fetterList_);
            }
            
            public FetterDataOuterClass.FetterData.Builder addFetterListBuilder() {
                return this.getFetterListFieldBuilder().addBuilder(FetterDataOuterClass.FetterData.getDefaultInstance());
            }
            
            public FetterDataOuterClass.FetterData.Builder addFetterListBuilder(final int index) {
                return this.getFetterListFieldBuilder().addBuilder(index, FetterDataOuterClass.FetterData.getDefaultInstance());
            }
            
            public List<FetterDataOuterClass.FetterData.Builder> getFetterListBuilderList() {
                return this.getFetterListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<FetterDataOuterClass.FetterData, FetterDataOuterClass.FetterData.Builder, FetterDataOuterClass.FetterDataOrBuilder> getFetterListFieldBuilder() {
                if (this.fetterListBuilder_ == null) {
                    this.fetterListBuilder_ = new RepeatedFieldBuilderV3<FetterDataOuterClass.FetterData, FetterDataOuterClass.FetterData.Builder, FetterDataOuterClass.FetterDataOrBuilder>(this.fetterList_, (this.bitField0_ & 0x8) != 0x0, this.getParentForChildren(), this.isClean());
                    this.fetterList_ = null;
                }
                return this.fetterListBuilder_;
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
    
    public interface AvatarFetterInfoOrBuilder extends MessageOrBuilder
    {
        int getExpNumber();
        
        int getExpLevel();
        
        List<Integer> getOpenIdListList();
        
        int getOpenIdListCount();
        
        int getOpenIdList(final int p0);
        
        List<Integer> getFinishIdListList();
        
        int getFinishIdListCount();
        
        int getFinishIdList(final int p0);
        
        List<Integer> getRewardedFetterLevelListList();
        
        int getRewardedFetterLevelListCount();
        
        int getRewardedFetterLevelList(final int p0);
        
        List<FetterDataOuterClass.FetterData> getFetterListList();
        
        FetterDataOuterClass.FetterData getFetterList(final int p0);
        
        int getFetterListCount();
        
        List<? extends FetterDataOuterClass.FetterDataOrBuilder> getFetterListOrBuilderList();
        
        FetterDataOuterClass.FetterDataOrBuilder getFetterListOrBuilder(final int p0);
    }
}
