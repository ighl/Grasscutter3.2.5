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

public final class MpPlayRewardInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_MpPlayRewardInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MpPlayRewardInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private MpPlayRewardInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MpPlayRewardInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016MpPlayRewardInfo.proto\"T\n\u0010MpPlayRewardInfo\u0012\r\n\u0005resin\u0018\u0001 \u0001(\r\u0012\u0017\n\u000fremain_uid_list\u0018\u0002 \u0003(\r\u0012\u0018\n\u0010qualify_uid_list\u0018\u0003 \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MpPlayRewardInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_MpPlayRewardInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MpPlayRewardInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MpPlayRewardInfoOuterClass.internal_static_MpPlayRewardInfo_descriptor, new String[] { "Resin", "RemainUidList", "QualifyUidList" });
    }
    
    public static final class MpPlayRewardInfo extends GeneratedMessageV3 implements MpPlayRewardInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RESIN_FIELD_NUMBER = 1;
        private int resin_;
        public static final int REMAIN_UID_LIST_FIELD_NUMBER = 2;
        private Internal.IntList remainUidList_;
        private int remainUidListMemoizedSerializedSize;
        public static final int QUALIFY_UID_LIST_FIELD_NUMBER = 3;
        private Internal.IntList qualifyUidList_;
        private int qualifyUidListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final MpPlayRewardInfo DEFAULT_INSTANCE;
        private static final Parser<MpPlayRewardInfo> PARSER;
        
        private MpPlayRewardInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.remainUidListMemoizedSerializedSize = -1;
            this.qualifyUidListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private MpPlayRewardInfo() {
            this.remainUidListMemoizedSerializedSize = -1;
            this.qualifyUidListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.remainUidList_ = GeneratedMessageV3.emptyIntList();
            this.qualifyUidList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new MpPlayRewardInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private MpPlayRewardInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                this.remainUidList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.remainUidList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 18: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.remainUidList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.remainUidList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 24: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.qualifyUidList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.qualifyUidList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 26: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.qualifyUidList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.qualifyUidList_.addInt(input.readUInt32());
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
                    this.remainUidList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.qualifyUidList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return MpPlayRewardInfoOuterClass.internal_static_MpPlayRewardInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MpPlayRewardInfoOuterClass.internal_static_MpPlayRewardInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(MpPlayRewardInfo.class, Builder.class);
        }
        
        @Override
        public int getResin() {
            return this.resin_;
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
            if (this.getRemainUidListList().size() > 0) {
                output.writeUInt32NoTag(18);
                output.writeUInt32NoTag(this.remainUidListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.remainUidList_.size(); ++i) {
                output.writeUInt32NoTag(this.remainUidList_.getInt(i));
            }
            if (this.getQualifyUidListList().size() > 0) {
                output.writeUInt32NoTag(26);
                output.writeUInt32NoTag(this.qualifyUidListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.qualifyUidList_.size(); ++i) {
                output.writeUInt32NoTag(this.qualifyUidList_.getInt(i));
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
            for (int i = 0; i < this.remainUidList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.remainUidList_.getInt(i));
            }
            size += dataSize;
            if (!this.getRemainUidListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.remainUidListMemoizedSerializedSize = dataSize;
            dataSize = 0;
            for (int i = 0; i < this.qualifyUidList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.qualifyUidList_.getInt(i));
            }
            size += dataSize;
            if (!this.getQualifyUidListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.qualifyUidListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MpPlayRewardInfo)) {
                return super.equals(obj);
            }
            final MpPlayRewardInfo other = (MpPlayRewardInfo)obj;
            return this.getResin() == other.getResin() && this.getRemainUidListList().equals(other.getRemainUidListList()) && this.getQualifyUidListList().equals(other.getQualifyUidListList()) && this.unknownFields.equals(other.unknownFields);
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
            if (this.getRemainUidListCount() > 0) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getRemainUidListList().hashCode();
            }
            if (this.getQualifyUidListCount() > 0) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getQualifyUidListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static MpPlayRewardInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return MpPlayRewardInfo.PARSER.parseFrom(data);
        }
        
        public static MpPlayRewardInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MpPlayRewardInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MpPlayRewardInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return MpPlayRewardInfo.PARSER.parseFrom(data);
        }
        
        public static MpPlayRewardInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MpPlayRewardInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MpPlayRewardInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return MpPlayRewardInfo.PARSER.parseFrom(data);
        }
        
        public static MpPlayRewardInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MpPlayRewardInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MpPlayRewardInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MpPlayRewardInfo.PARSER, input);
        }
        
        public static MpPlayRewardInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MpPlayRewardInfo.PARSER, input, extensionRegistry);
        }
        
        public static MpPlayRewardInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MpPlayRewardInfo.PARSER, input);
        }
        
        public static MpPlayRewardInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MpPlayRewardInfo.PARSER, input, extensionRegistry);
        }
        
        public static MpPlayRewardInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MpPlayRewardInfo.PARSER, input);
        }
        
        public static MpPlayRewardInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MpPlayRewardInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return MpPlayRewardInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final MpPlayRewardInfo prototype) {
            return MpPlayRewardInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == MpPlayRewardInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static MpPlayRewardInfo getDefaultInstance() {
            return MpPlayRewardInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<MpPlayRewardInfo> parser() {
            return MpPlayRewardInfo.PARSER;
        }
        
        @Override
        public Parser<MpPlayRewardInfo> getParserForType() {
            return MpPlayRewardInfo.PARSER;
        }
        
        @Override
        public MpPlayRewardInfo getDefaultInstanceForType() {
            return MpPlayRewardInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new MpPlayRewardInfo();
            PARSER = new AbstractParser<MpPlayRewardInfo>() {
                @Override
                public MpPlayRewardInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new MpPlayRewardInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MpPlayRewardInfoOrBuilder
        {
            private int bitField0_;
            private int resin_;
            private Internal.IntList remainUidList_;
            private Internal.IntList qualifyUidList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return MpPlayRewardInfoOuterClass.internal_static_MpPlayRewardInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MpPlayRewardInfoOuterClass.internal_static_MpPlayRewardInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(MpPlayRewardInfo.class, Builder.class);
            }
            
            private Builder() {
                this.remainUidList_ = GeneratedMessageV3.emptyIntList();
                this.qualifyUidList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.remainUidList_ = GeneratedMessageV3.emptyIntList();
                this.qualifyUidList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (MpPlayRewardInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.resin_ = 0;
                this.remainUidList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.qualifyUidList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return MpPlayRewardInfoOuterClass.internal_static_MpPlayRewardInfo_descriptor;
            }
            
            @Override
            public MpPlayRewardInfo getDefaultInstanceForType() {
                return MpPlayRewardInfo.getDefaultInstance();
            }
            
            @Override
            public MpPlayRewardInfo build() {
                final MpPlayRewardInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public MpPlayRewardInfo buildPartial() {
                final MpPlayRewardInfo result = new MpPlayRewardInfo(this);
                final int from_bitField0_ = this.bitField0_;
                result.resin_ = this.resin_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.remainUidList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.remainUidList_ = this.remainUidList_;
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.qualifyUidList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.qualifyUidList_ = this.qualifyUidList_;
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
                if (other instanceof MpPlayRewardInfo) {
                    return this.mergeFrom((MpPlayRewardInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final MpPlayRewardInfo other) {
                if (other == MpPlayRewardInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getResin() != 0) {
                    this.setResin(other.getResin());
                }
                if (!other.remainUidList_.isEmpty()) {
                    if (this.remainUidList_.isEmpty()) {
                        this.remainUidList_ = other.remainUidList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureRemainUidListIsMutable();
                        this.remainUidList_.addAll(other.remainUidList_);
                    }
                    this.onChanged();
                }
                if (!other.qualifyUidList_.isEmpty()) {
                    if (this.qualifyUidList_.isEmpty()) {
                        this.qualifyUidList_ = other.qualifyUidList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensureQualifyUidListIsMutable();
                        this.qualifyUidList_.addAll(other.qualifyUidList_);
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
                MpPlayRewardInfo parsedMessage = null;
                try {
                    parsedMessage = MpPlayRewardInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (MpPlayRewardInfo)e.getUnfinishedMessage();
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
            
            private void ensureRemainUidListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.remainUidList_ = GeneratedMessageV3.mutableCopy(this.remainUidList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getRemainUidListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.remainUidList_) : this.remainUidList_;
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
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            private void ensureQualifyUidListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.qualifyUidList_ = GeneratedMessageV3.mutableCopy(this.qualifyUidList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Integer> getQualifyUidListList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.qualifyUidList_) : this.qualifyUidList_;
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
    
    public interface MpPlayRewardInfoOrBuilder extends MessageOrBuilder
    {
        int getResin();
        
        List<Integer> getRemainUidListList();
        
        int getRemainUidListCount();
        
        int getRemainUidList(final int p0);
        
        List<Integer> getQualifyUidListList();
        
        int getQualifyUidListCount();
        
        int getQualifyUidList(final int p0);
    }
}
