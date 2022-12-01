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

public final class BlossomChestInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_BlossomChestInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_BlossomChestInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private BlossomChestInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return BlossomChestInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016BlossomChestInfo.proto\"\u0099\u0001\n\u0010BlossomChestInfo\u0012\r\n\u0005resin\u0018\u0001 \u0001(\r\u0012\u0018\n\u0010qualify_uid_list\u0018\u0002 \u0003(\r\u0012\u0017\n\u000fremain_uid_list\u0018\u0003 \u0003(\r\u0012\u0011\n\tdead_time\u0018\u0004 \u0001(\r\u0012\u001c\n\u0014blossom_refresh_type\u0018\u0005 \u0001(\r\u0012\u0012\n\nrefresh_id\u0018\u0006 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        BlossomChestInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_BlossomChestInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_BlossomChestInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(BlossomChestInfoOuterClass.internal_static_BlossomChestInfo_descriptor, new String[] { "Resin", "QualifyUidList", "RemainUidList", "DeadTime", "BlossomRefreshType", "RefreshId" });
    }
    
    public static final class BlossomChestInfo extends GeneratedMessageV3 implements BlossomChestInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RESIN_FIELD_NUMBER = 1;
        private int resin_;
        public static final int QUALIFY_UID_LIST_FIELD_NUMBER = 2;
        private Internal.IntList qualifyUidList_;
        private int qualifyUidListMemoizedSerializedSize;
        public static final int REMAIN_UID_LIST_FIELD_NUMBER = 3;
        private Internal.IntList remainUidList_;
        private int remainUidListMemoizedSerializedSize;
        public static final int DEAD_TIME_FIELD_NUMBER = 4;
        private int deadTime_;
        public static final int BLOSSOM_REFRESH_TYPE_FIELD_NUMBER = 5;
        private int blossomRefreshType_;
        public static final int REFRESH_ID_FIELD_NUMBER = 6;
        private int refreshId_;
        private byte memoizedIsInitialized;
        private static final BlossomChestInfo DEFAULT_INSTANCE;
        private static final Parser<BlossomChestInfo> PARSER;
        
        private BlossomChestInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.qualifyUidListMemoizedSerializedSize = -1;
            this.remainUidListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private BlossomChestInfo() {
            this.qualifyUidListMemoizedSerializedSize = -1;
            this.remainUidListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.qualifyUidList_ = GeneratedMessageV3.emptyIntList();
            this.remainUidList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new BlossomChestInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private BlossomChestInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.resin_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.qualifyUidList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.qualifyUidList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 18: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.qualifyUidList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.qualifyUidList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 24: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.remainUidList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.remainUidList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 26: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.remainUidList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.remainUidList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 32: {
                            this.deadTime_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            this.blossomRefreshType_ = input.readUInt32();
                            continue;
                        }
                        case 48: {
                            this.refreshId_ = input.readUInt32();
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
                    this.qualifyUidList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.remainUidList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return BlossomChestInfoOuterClass.internal_static_BlossomChestInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return BlossomChestInfoOuterClass.internal_static_BlossomChestInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(BlossomChestInfo.class, Builder.class);
        }
        
        @Override
        public int getResin() {
            return this.resin_;
        }
        
        @Override
        public List<Integer> getQualifyUidListList() {
            return this.qualifyUidList_;
        }
        
        @Override
        public int getQualifyUidListCount() {
            return this.qualifyUidList_.size();
        }
        
        @Override
        public int getQualifyUidList(final int index) {
            return this.qualifyUidList_.getInt(index);
        }
        
        @Override
        public List<Integer> getRemainUidListList() {
            return this.remainUidList_;
        }
        
        @Override
        public int getRemainUidListCount() {
            return this.remainUidList_.size();
        }
        
        @Override
        public int getRemainUidList(final int index) {
            return this.remainUidList_.getInt(index);
        }
        
        @Override
        public int getDeadTime() {
            return this.deadTime_;
        }
        
        @Override
        public int getBlossomRefreshType() {
            return this.blossomRefreshType_;
        }
        
        @Override
        public int getRefreshId() {
            return this.refreshId_;
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
            if (this.resin_ != 0) {
                output.writeUInt32(1, this.resin_);
            }
            if (this.getQualifyUidListList().size() > 0) {
                output.writeUInt32NoTag(18);
                output.writeUInt32NoTag(this.qualifyUidListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.qualifyUidList_.size(); ++i) {
                output.writeUInt32NoTag(this.qualifyUidList_.getInt(i));
            }
            if (this.getRemainUidListList().size() > 0) {
                output.writeUInt32NoTag(26);
                output.writeUInt32NoTag(this.remainUidListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.remainUidList_.size(); ++i) {
                output.writeUInt32NoTag(this.remainUidList_.getInt(i));
            }
            if (this.deadTime_ != 0) {
                output.writeUInt32(4, this.deadTime_);
            }
            if (this.blossomRefreshType_ != 0) {
                output.writeUInt32(5, this.blossomRefreshType_);
            }
            if (this.refreshId_ != 0) {
                output.writeUInt32(6, this.refreshId_);
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
            if (this.resin_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.resin_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.qualifyUidList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.qualifyUidList_.getInt(i));
            }
            size += dataSize;
            if (!this.getQualifyUidListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.qualifyUidListMemoizedSerializedSize = dataSize;
            dataSize = 0;
            for (int i = 0; i < this.remainUidList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.remainUidList_.getInt(i));
            }
            size += dataSize;
            if (!this.getRemainUidListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.remainUidListMemoizedSerializedSize = dataSize;
            if (this.deadTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.deadTime_);
            }
            if (this.blossomRefreshType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.blossomRefreshType_);
            }
            if (this.refreshId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.refreshId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BlossomChestInfo)) {
                return super.equals(obj);
            }
            final BlossomChestInfo other = (BlossomChestInfo)obj;
            return this.getResin() == other.getResin() && this.getQualifyUidListList().equals(other.getQualifyUidListList()) && this.getRemainUidListList().equals(other.getRemainUidListList()) && this.getDeadTime() == other.getDeadTime() && this.getBlossomRefreshType() == other.getBlossomRefreshType() && this.getRefreshId() == other.getRefreshId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getResin();
            if (this.getQualifyUidListCount() > 0) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getQualifyUidListList().hashCode();
            }
            if (this.getRemainUidListCount() > 0) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getRemainUidListList().hashCode();
            }
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getDeadTime();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getBlossomRefreshType();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getRefreshId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static BlossomChestInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return BlossomChestInfo.PARSER.parseFrom(data);
        }
        
        public static BlossomChestInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BlossomChestInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BlossomChestInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return BlossomChestInfo.PARSER.parseFrom(data);
        }
        
        public static BlossomChestInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BlossomChestInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BlossomChestInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return BlossomChestInfo.PARSER.parseFrom(data);
        }
        
        public static BlossomChestInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BlossomChestInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BlossomChestInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BlossomChestInfo.PARSER, input);
        }
        
        public static BlossomChestInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BlossomChestInfo.PARSER, input, extensionRegistry);
        }
        
        public static BlossomChestInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BlossomChestInfo.PARSER, input);
        }
        
        public static BlossomChestInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BlossomChestInfo.PARSER, input, extensionRegistry);
        }
        
        public static BlossomChestInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BlossomChestInfo.PARSER, input);
        }
        
        public static BlossomChestInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BlossomChestInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return BlossomChestInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final BlossomChestInfo prototype) {
            return BlossomChestInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == BlossomChestInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static BlossomChestInfo getDefaultInstance() {
            return BlossomChestInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<BlossomChestInfo> parser() {
            return BlossomChestInfo.PARSER;
        }
        
        @Override
        public Parser<BlossomChestInfo> getParserForType() {
            return BlossomChestInfo.PARSER;
        }
        
        @Override
        public BlossomChestInfo getDefaultInstanceForType() {
            return BlossomChestInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new BlossomChestInfo();
            PARSER = new AbstractParser<BlossomChestInfo>() {
                @Override
                public BlossomChestInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new BlossomChestInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BlossomChestInfoOrBuilder
        {
            private int bitField0_;
            private int resin_;
            private Internal.IntList qualifyUidList_;
            private Internal.IntList remainUidList_;
            private int deadTime_;
            private int blossomRefreshType_;
            private int refreshId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return BlossomChestInfoOuterClass.internal_static_BlossomChestInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return BlossomChestInfoOuterClass.internal_static_BlossomChestInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(BlossomChestInfo.class, Builder.class);
            }
            
            private Builder() {
                this.qualifyUidList_ = GeneratedMessageV3.emptyIntList();
                this.remainUidList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.qualifyUidList_ = GeneratedMessageV3.emptyIntList();
                this.remainUidList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (BlossomChestInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.resin_ = 0;
                this.qualifyUidList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.remainUidList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.deadTime_ = 0;
                this.blossomRefreshType_ = 0;
                this.refreshId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return BlossomChestInfoOuterClass.internal_static_BlossomChestInfo_descriptor;
            }
            
            @Override
            public BlossomChestInfo getDefaultInstanceForType() {
                return BlossomChestInfo.getDefaultInstance();
            }
            
            @Override
            public BlossomChestInfo build() {
                final BlossomChestInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public BlossomChestInfo buildPartial() {
                final BlossomChestInfo result = new BlossomChestInfo(this);
                final int from_bitField0_ = this.bitField0_;
                result.resin_ = this.resin_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.qualifyUidList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.qualifyUidList_ = this.qualifyUidList_;
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.remainUidList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.remainUidList_ = this.remainUidList_;
                result.deadTime_ = this.deadTime_;
                result.blossomRefreshType_ = this.blossomRefreshType_;
                result.refreshId_ = this.refreshId_;
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
                if (other instanceof BlossomChestInfo) {
                    return this.mergeFrom((BlossomChestInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final BlossomChestInfo other) {
                if (other == BlossomChestInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getResin() != 0) {
                    this.setResin(other.getResin());
                }
                if (!other.qualifyUidList_.isEmpty()) {
                    if (this.qualifyUidList_.isEmpty()) {
                        this.qualifyUidList_ = other.qualifyUidList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureQualifyUidListIsMutable();
                        this.qualifyUidList_.addAll(other.qualifyUidList_);
                    }
                    this.onChanged();
                }
                if (!other.remainUidList_.isEmpty()) {
                    if (this.remainUidList_.isEmpty()) {
                        this.remainUidList_ = other.remainUidList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensureRemainUidListIsMutable();
                        this.remainUidList_.addAll(other.remainUidList_);
                    }
                    this.onChanged();
                }
                if (other.getDeadTime() != 0) {
                    this.setDeadTime(other.getDeadTime());
                }
                if (other.getBlossomRefreshType() != 0) {
                    this.setBlossomRefreshType(other.getBlossomRefreshType());
                }
                if (other.getRefreshId() != 0) {
                    this.setRefreshId(other.getRefreshId());
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
                BlossomChestInfo parsedMessage = null;
                try {
                    parsedMessage = BlossomChestInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (BlossomChestInfo)e.getUnfinishedMessage();
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
            public int getResin() {
                return this.resin_;
            }
            
            public Builder setResin(final int value) {
                this.resin_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearResin() {
                this.resin_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureQualifyUidListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.qualifyUidList_ = GeneratedMessageV3.mutableCopy(this.qualifyUidList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getQualifyUidListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.qualifyUidList_) : this.qualifyUidList_;
            }
            
            @Override
            public int getQualifyUidListCount() {
                return this.qualifyUidList_.size();
            }
            
            @Override
            public int getQualifyUidList(final int index) {
                return this.qualifyUidList_.getInt(index);
            }
            
            public Builder setQualifyUidList(final int index, final int value) {
                this.ensureQualifyUidListIsMutable();
                this.qualifyUidList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addQualifyUidList(final int value) {
                this.ensureQualifyUidListIsMutable();
                this.qualifyUidList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllQualifyUidList(final Iterable<? extends Integer> values) {
                this.ensureQualifyUidListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.qualifyUidList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearQualifyUidList() {
                this.qualifyUidList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            private void ensureRemainUidListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.remainUidList_ = GeneratedMessageV3.mutableCopy(this.remainUidList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Integer> getRemainUidListList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.remainUidList_) : this.remainUidList_;
            }
            
            @Override
            public int getRemainUidListCount() {
                return this.remainUidList_.size();
            }
            
            @Override
            public int getRemainUidList(final int index) {
                return this.remainUidList_.getInt(index);
            }
            
            public Builder setRemainUidList(final int index, final int value) {
                this.ensureRemainUidListIsMutable();
                this.remainUidList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addRemainUidList(final int value) {
                this.ensureRemainUidListIsMutable();
                this.remainUidList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllRemainUidList(final Iterable<? extends Integer> values) {
                this.ensureRemainUidListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.remainUidList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearRemainUidList() {
                this.remainUidList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getDeadTime() {
                return this.deadTime_;
            }
            
            public Builder setDeadTime(final int value) {
                this.deadTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearDeadTime() {
                this.deadTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getBlossomRefreshType() {
                return this.blossomRefreshType_;
            }
            
            public Builder setBlossomRefreshType(final int value) {
                this.blossomRefreshType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearBlossomRefreshType() {
                this.blossomRefreshType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getRefreshId() {
                return this.refreshId_;
            }
            
            public Builder setRefreshId(final int value) {
                this.refreshId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRefreshId() {
                this.refreshId_ = 0;
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
    
    public interface BlossomChestInfoOrBuilder extends MessageOrBuilder
    {
        int getResin();
        
        List<Integer> getQualifyUidListList();
        
        int getQualifyUidListCount();
        
        int getQualifyUidList(final int p0);
        
        List<Integer> getRemainUidListList();
        
        int getRemainUidListCount();
        
        int getRemainUidList(final int p0);
        
        int getDeadTime();
        
        int getBlossomRefreshType();
        
        int getRefreshId();
    }
}
