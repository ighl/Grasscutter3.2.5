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

public final class AvatarSkillInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_AvatarSkillInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarSkillInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AvatarSkillInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AvatarSkillInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0015AvatarSkillInfo.proto\"\\\n\u000fAvatarSkillInfo\u0012\u0014\n\fpass_cd_time\u0018\u0001 \u0001(\r\u0012\u0019\n\u0011full_cd_time_list\u0018\u0002 \u0003(\r\u0012\u0018\n\u0010max_charge_count\u0018\u0003 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AvatarSkillInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_AvatarSkillInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AvatarSkillInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarSkillInfoOuterClass.internal_static_AvatarSkillInfo_descriptor, new String[] { "PassCdTime", "FullCdTimeList", "MaxChargeCount" });
    }
    
    public static final class AvatarSkillInfo extends GeneratedMessageV3 implements AvatarSkillInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int PASS_CD_TIME_FIELD_NUMBER = 1;
        private int passCdTime_;
        public static final int FULL_CD_TIME_LIST_FIELD_NUMBER = 2;
        private Internal.IntList fullCdTimeList_;
        private int fullCdTimeListMemoizedSerializedSize;
        public static final int MAX_CHARGE_COUNT_FIELD_NUMBER = 3;
        private int maxChargeCount_;
        private byte memoizedIsInitialized;
        private static final AvatarSkillInfo DEFAULT_INSTANCE;
        private static final Parser<AvatarSkillInfo> PARSER;
        
        private AvatarSkillInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.fullCdTimeListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private AvatarSkillInfo() {
            this.fullCdTimeListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.fullCdTimeList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AvatarSkillInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AvatarSkillInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.passCdTime_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.fullCdTimeList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.fullCdTimeList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 18: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.fullCdTimeList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.fullCdTimeList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 24: {
                            this.maxChargeCount_ = input.readUInt32();
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
                    this.fullCdTimeList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return AvatarSkillInfoOuterClass.internal_static_AvatarSkillInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AvatarSkillInfoOuterClass.internal_static_AvatarSkillInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarSkillInfo.class, Builder.class);
        }
        
        @Override
        public int getPassCdTime() {
            return this.passCdTime_;
        }
        
        @Override
        public List<Integer> getFullCdTimeListList() {
            return this.fullCdTimeList_;
        }
        
        @Override
        public int getFullCdTimeListCount() {
            return this.fullCdTimeList_.size();
        }
        
        @Override
        public int getFullCdTimeList(final int index) {
            return this.fullCdTimeList_.getInt(index);
        }
        
        @Override
        public int getMaxChargeCount() {
            return this.maxChargeCount_;
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
            if (this.passCdTime_ != 0) {
                output.writeUInt32(1, this.passCdTime_);
            }
            if (this.getFullCdTimeListList().size() > 0) {
                output.writeUInt32NoTag(18);
                output.writeUInt32NoTag(this.fullCdTimeListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.fullCdTimeList_.size(); ++i) {
                output.writeUInt32NoTag(this.fullCdTimeList_.getInt(i));
            }
            if (this.maxChargeCount_ != 0) {
                output.writeUInt32(3, this.maxChargeCount_);
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
            if (this.passCdTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.passCdTime_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.fullCdTimeList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.fullCdTimeList_.getInt(i));
            }
            size += dataSize;
            if (!this.getFullCdTimeListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.fullCdTimeListMemoizedSerializedSize = dataSize;
            if (this.maxChargeCount_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.maxChargeCount_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarSkillInfo)) {
                return super.equals(obj);
            }
            final AvatarSkillInfo other = (AvatarSkillInfo)obj;
            return this.getPassCdTime() == other.getPassCdTime() && this.getFullCdTimeListList().equals(other.getFullCdTimeListList()) && this.getMaxChargeCount() == other.getMaxChargeCount() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getPassCdTime();
            if (this.getFullCdTimeListCount() > 0) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getFullCdTimeListList().hashCode();
            }
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getMaxChargeCount();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AvatarSkillInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AvatarSkillInfo.PARSER.parseFrom(data);
        }
        
        public static AvatarSkillInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarSkillInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarSkillInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AvatarSkillInfo.PARSER.parseFrom(data);
        }
        
        public static AvatarSkillInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarSkillInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarSkillInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AvatarSkillInfo.PARSER.parseFrom(data);
        }
        
        public static AvatarSkillInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarSkillInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarSkillInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarSkillInfo.PARSER, input);
        }
        
        public static AvatarSkillInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarSkillInfo.PARSER, input, extensionRegistry);
        }
        
        public static AvatarSkillInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarSkillInfo.PARSER, input);
        }
        
        public static AvatarSkillInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarSkillInfo.PARSER, input, extensionRegistry);
        }
        
        public static AvatarSkillInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarSkillInfo.PARSER, input);
        }
        
        public static AvatarSkillInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarSkillInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AvatarSkillInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AvatarSkillInfo prototype) {
            return AvatarSkillInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AvatarSkillInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AvatarSkillInfo getDefaultInstance() {
            return AvatarSkillInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<AvatarSkillInfo> parser() {
            return AvatarSkillInfo.PARSER;
        }
        
        @Override
        public Parser<AvatarSkillInfo> getParserForType() {
            return AvatarSkillInfo.PARSER;
        }
        
        @Override
        public AvatarSkillInfo getDefaultInstanceForType() {
            return AvatarSkillInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AvatarSkillInfo();
            PARSER = new AbstractParser<AvatarSkillInfo>() {
                @Override
                public AvatarSkillInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AvatarSkillInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AvatarSkillInfoOrBuilder
        {
            private int bitField0_;
            private int passCdTime_;
            private Internal.IntList fullCdTimeList_;
            private int maxChargeCount_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AvatarSkillInfoOuterClass.internal_static_AvatarSkillInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AvatarSkillInfoOuterClass.internal_static_AvatarSkillInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarSkillInfo.class, Builder.class);
            }
            
            private Builder() {
                this.fullCdTimeList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.fullCdTimeList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AvatarSkillInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.passCdTime_ = 0;
                this.fullCdTimeList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.maxChargeCount_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AvatarSkillInfoOuterClass.internal_static_AvatarSkillInfo_descriptor;
            }
            
            @Override
            public AvatarSkillInfo getDefaultInstanceForType() {
                return AvatarSkillInfo.getDefaultInstance();
            }
            
            @Override
            public AvatarSkillInfo build() {
                final AvatarSkillInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AvatarSkillInfo buildPartial() {
                final AvatarSkillInfo result = new AvatarSkillInfo(this);
                final int from_bitField0_ = this.bitField0_;
                result.passCdTime_ = this.passCdTime_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.fullCdTimeList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.fullCdTimeList_ = this.fullCdTimeList_;
                result.maxChargeCount_ = this.maxChargeCount_;
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
                if (other instanceof AvatarSkillInfo) {
                    return this.mergeFrom((AvatarSkillInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AvatarSkillInfo other) {
                if (other == AvatarSkillInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getPassCdTime() != 0) {
                    this.setPassCdTime(other.getPassCdTime());
                }
                if (!other.fullCdTimeList_.isEmpty()) {
                    if (this.fullCdTimeList_.isEmpty()) {
                        this.fullCdTimeList_ = other.fullCdTimeList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureFullCdTimeListIsMutable();
                        this.fullCdTimeList_.addAll(other.fullCdTimeList_);
                    }
                    this.onChanged();
                }
                if (other.getMaxChargeCount() != 0) {
                    this.setMaxChargeCount(other.getMaxChargeCount());
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
                AvatarSkillInfo parsedMessage = null;
                try {
                    parsedMessage = AvatarSkillInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AvatarSkillInfo)e.getUnfinishedMessage();
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
            public int getPassCdTime() {
                return this.passCdTime_;
            }
            
            public Builder setPassCdTime(final int value) {
                this.passCdTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPassCdTime() {
                this.passCdTime_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureFullCdTimeListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.fullCdTimeList_ = GeneratedMessageV3.mutableCopy(this.fullCdTimeList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getFullCdTimeListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.fullCdTimeList_) : this.fullCdTimeList_;
            }
            
            @Override
            public int getFullCdTimeListCount() {
                return this.fullCdTimeList_.size();
            }
            
            @Override
            public int getFullCdTimeList(final int index) {
                return this.fullCdTimeList_.getInt(index);
            }
            
            public Builder setFullCdTimeList(final int index, final int value) {
                this.ensureFullCdTimeListIsMutable();
                this.fullCdTimeList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addFullCdTimeList(final int value) {
                this.ensureFullCdTimeListIsMutable();
                this.fullCdTimeList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllFullCdTimeList(final Iterable<? extends Integer> values) {
                this.ensureFullCdTimeListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.fullCdTimeList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearFullCdTimeList() {
                this.fullCdTimeList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getMaxChargeCount() {
                return this.maxChargeCount_;
            }
            
            public Builder setMaxChargeCount(final int value) {
                this.maxChargeCount_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMaxChargeCount() {
                this.maxChargeCount_ = 0;
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
    
    public interface AvatarSkillInfoOrBuilder extends MessageOrBuilder
    {
        int getPassCdTime();
        
        List<Integer> getFullCdTimeListList();
        
        int getFullCdTimeListCount();
        
        int getFullCdTimeList(final int p0);
        
        int getMaxChargeCount();
    }
}
