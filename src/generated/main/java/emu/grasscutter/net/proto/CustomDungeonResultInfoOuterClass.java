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
import com.google.protobuf.Internal;
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
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class CustomDungeonResultInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_CustomDungeonResultInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CustomDungeonResultInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private CustomDungeonResultInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return CustomDungeonResultInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001dCustomDungeonResultInfo.proto\u001a\u0019Unk2700_FDEGJOCDDGH.proto\u001a\u0019Unk2700_OCOKILBJIPJ.proto\"¤\u0002\n\u0017CustomDungeonResultInfo\u0012\u001b\n\u0013Unk2700_BONNHGKDLFO\u0018\f \u0001(\b\u0012\u001b\n\u0013Unk2700_FBBEJKCDMEI\u0018\t \u0001(\r\u00122\n\u0014child_challenge_list\u0018\u0006 \u0003(\u000b2\u0014.Unk2700_FDEGJOCDDGH\u0012\u001b\n\u0013Unk2700_ONOOJBEABOE\u0018\u0003 \u0001(\u0004\u00121\n\u0013Unk2700_ONCDLPDHFAB\u0018\u0007 \u0001(\u000e2\u0014.Unk2700_OCOKILBJIPJ\u0012\u0011\n\ttime_cost\u0018\u000b \u0001(\r\u0012\u001b\n\u0013Unk2700_IBDCFAMBGOK\u0018\u0002 \u0001(\b\u0012\u001b\n\u0013Unk2700_HBFLKFOCKBF\u0018\u000e \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        CustomDungeonResultInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { Unk2700FDEGJOCDDGH.getDescriptor(), Unk2700OCOKILBJIPJ.getDescriptor() });
        internal_static_CustomDungeonResultInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CustomDungeonResultInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(CustomDungeonResultInfoOuterClass.internal_static_CustomDungeonResultInfo_descriptor, new String[] { "Unk2700BONNHGKDLFO", "Unk2700FBBEJKCDMEI", "ChildChallengeList", "Unk2700ONOOJBEABOE", "Unk2700ONCDLPDHFAB", "TimeCost", "Unk2700IBDCFAMBGOK", "Unk2700HBFLKFOCKBF" });
        Unk2700FDEGJOCDDGH.getDescriptor();
        Unk2700OCOKILBJIPJ.getDescriptor();
    }
    
    public static final class CustomDungeonResultInfo extends GeneratedMessageV3 implements CustomDungeonResultInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int UNK2700_BONNHGKDLFO_FIELD_NUMBER = 12;
        private boolean unk2700BONNHGKDLFO_;
        public static final int UNK2700_FBBEJKCDMEI_FIELD_NUMBER = 9;
        private int unk2700FBBEJKCDMEI_;
        public static final int CHILD_CHALLENGE_LIST_FIELD_NUMBER = 6;
        private List<Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH> childChallengeList_;
        public static final int UNK2700_ONOOJBEABOE_FIELD_NUMBER = 3;
        private long unk2700ONOOJBEABOE_;
        public static final int UNK2700_ONCDLPDHFAB_FIELD_NUMBER = 7;
        private int unk2700ONCDLPDHFAB_;
        public static final int TIME_COST_FIELD_NUMBER = 11;
        private int timeCost_;
        public static final int UNK2700_IBDCFAMBGOK_FIELD_NUMBER = 2;
        private boolean unk2700IBDCFAMBGOK_;
        public static final int UNK2700_HBFLKFOCKBF_FIELD_NUMBER = 14;
        private boolean unk2700HBFLKFOCKBF_;
        private byte memoizedIsInitialized;
        private static final CustomDungeonResultInfo DEFAULT_INSTANCE;
        private static final Parser<CustomDungeonResultInfo> PARSER;
        
        private CustomDungeonResultInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private CustomDungeonResultInfo() {
            this.memoizedIsInitialized = -1;
            this.childChallengeList_ = Collections.emptyList();
            this.unk2700ONCDLPDHFAB_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new CustomDungeonResultInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private CustomDungeonResultInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.unk2700IBDCFAMBGOK_ = input.readBool();
                            continue;
                        }
                        case 24: {
                            this.unk2700ONOOJBEABOE_ = input.readUInt64();
                            continue;
                        }
                        case 50: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.childChallengeList_ = new ArrayList<Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.childChallengeList_.add(input.readMessage(Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH.parser(), extensionRegistry));
                            continue;
                        }
                        case 56: {
                            final int rawValue = input.readEnum();
                            this.unk2700ONCDLPDHFAB_ = rawValue;
                            continue;
                        }
                        case 72: {
                            this.unk2700FBBEJKCDMEI_ = input.readUInt32();
                            continue;
                        }
                        case 88: {
                            this.timeCost_ = input.readUInt32();
                            continue;
                        }
                        case 96: {
                            this.unk2700BONNHGKDLFO_ = input.readBool();
                            continue;
                        }
                        case 112: {
                            this.unk2700HBFLKFOCKBF_ = input.readBool();
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
                    this.childChallengeList_ = Collections.unmodifiableList((List<? extends Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH>)this.childChallengeList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return CustomDungeonResultInfoOuterClass.internal_static_CustomDungeonResultInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return CustomDungeonResultInfoOuterClass.internal_static_CustomDungeonResultInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CustomDungeonResultInfo.class, Builder.class);
        }
        
        @Override
        public boolean getUnk2700BONNHGKDLFO() {
            return this.unk2700BONNHGKDLFO_;
        }
        
        @Override
        public int getUnk2700FBBEJKCDMEI() {
            return this.unk2700FBBEJKCDMEI_;
        }
        
        @Override
        public List<Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH> getChildChallengeListList() {
            return this.childChallengeList_;
        }
        
        @Override
        public List<? extends Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGHOrBuilder> getChildChallengeListOrBuilderList() {
            return this.childChallengeList_;
        }
        
        @Override
        public int getChildChallengeListCount() {
            return this.childChallengeList_.size();
        }
        
        @Override
        public Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH getChildChallengeList(final int index) {
            return this.childChallengeList_.get(index);
        }
        
        @Override
        public Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGHOrBuilder getChildChallengeListOrBuilder(final int index) {
            return this.childChallengeList_.get(index);
        }
        
        @Override
        public long getUnk2700ONOOJBEABOE() {
            return this.unk2700ONOOJBEABOE_;
        }
        
        @Override
        public int getUnk2700ONCDLPDHFABValue() {
            return this.unk2700ONCDLPDHFAB_;
        }
        
        @Override
        public Unk2700OCOKILBJIPJ.Unk2700_OCOKILBJIPJ getUnk2700ONCDLPDHFAB() {
            final Unk2700OCOKILBJIPJ.Unk2700_OCOKILBJIPJ result = Unk2700OCOKILBJIPJ.Unk2700_OCOKILBJIPJ.valueOf(this.unk2700ONCDLPDHFAB_);
            return (result == null) ? Unk2700OCOKILBJIPJ.Unk2700_OCOKILBJIPJ.UNRECOGNIZED : result;
        }
        
        @Override
        public int getTimeCost() {
            return this.timeCost_;
        }
        
        @Override
        public boolean getUnk2700IBDCFAMBGOK() {
            return this.unk2700IBDCFAMBGOK_;
        }
        
        @Override
        public boolean getUnk2700HBFLKFOCKBF() {
            return this.unk2700HBFLKFOCKBF_;
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
            if (this.unk2700IBDCFAMBGOK_) {
                output.writeBool(2, this.unk2700IBDCFAMBGOK_);
            }
            if (this.unk2700ONOOJBEABOE_ != 0L) {
                output.writeUInt64(3, this.unk2700ONOOJBEABOE_);
            }
            for (int i = 0; i < this.childChallengeList_.size(); ++i) {
                output.writeMessage(6, this.childChallengeList_.get(i));
            }
            if (this.unk2700ONCDLPDHFAB_ != Unk2700OCOKILBJIPJ.Unk2700_OCOKILBJIPJ.Unk2700_OCOKILBJIPJ_Unk2700_MPGOEMPNCEH.getNumber()) {
                output.writeEnum(7, this.unk2700ONCDLPDHFAB_);
            }
            if (this.unk2700FBBEJKCDMEI_ != 0) {
                output.writeUInt32(9, this.unk2700FBBEJKCDMEI_);
            }
            if (this.timeCost_ != 0) {
                output.writeUInt32(11, this.timeCost_);
            }
            if (this.unk2700BONNHGKDLFO_) {
                output.writeBool(12, this.unk2700BONNHGKDLFO_);
            }
            if (this.unk2700HBFLKFOCKBF_) {
                output.writeBool(14, this.unk2700HBFLKFOCKBF_);
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
            if (this.unk2700IBDCFAMBGOK_) {
                size += CodedOutputStream.computeBoolSize(2, this.unk2700IBDCFAMBGOK_);
            }
            if (this.unk2700ONOOJBEABOE_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(3, this.unk2700ONOOJBEABOE_);
            }
            for (int i = 0; i < this.childChallengeList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(6, this.childChallengeList_.get(i));
            }
            if (this.unk2700ONCDLPDHFAB_ != Unk2700OCOKILBJIPJ.Unk2700_OCOKILBJIPJ.Unk2700_OCOKILBJIPJ_Unk2700_MPGOEMPNCEH.getNumber()) {
                size += CodedOutputStream.computeEnumSize(7, this.unk2700ONCDLPDHFAB_);
            }
            if (this.unk2700FBBEJKCDMEI_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.unk2700FBBEJKCDMEI_);
            }
            if (this.timeCost_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.timeCost_);
            }
            if (this.unk2700BONNHGKDLFO_) {
                size += CodedOutputStream.computeBoolSize(12, this.unk2700BONNHGKDLFO_);
            }
            if (this.unk2700HBFLKFOCKBF_) {
                size += CodedOutputStream.computeBoolSize(14, this.unk2700HBFLKFOCKBF_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CustomDungeonResultInfo)) {
                return super.equals(obj);
            }
            final CustomDungeonResultInfo other = (CustomDungeonResultInfo)obj;
            return this.getUnk2700BONNHGKDLFO() == other.getUnk2700BONNHGKDLFO() && this.getUnk2700FBBEJKCDMEI() == other.getUnk2700FBBEJKCDMEI() && this.getChildChallengeListList().equals(other.getChildChallengeListList()) && this.getUnk2700ONOOJBEABOE() == other.getUnk2700ONOOJBEABOE() && this.unk2700ONCDLPDHFAB_ == other.unk2700ONCDLPDHFAB_ && this.getTimeCost() == other.getTimeCost() && this.getUnk2700IBDCFAMBGOK() == other.getUnk2700IBDCFAMBGOK() && this.getUnk2700HBFLKFOCKBF() == other.getUnk2700HBFLKFOCKBF() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 12;
            hash = 53 * hash + Internal.hashBoolean(this.getUnk2700BONNHGKDLFO());
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getUnk2700FBBEJKCDMEI();
            if (this.getChildChallengeListCount() > 0) {
                hash = 37 * hash + 6;
                hash = 53 * hash + this.getChildChallengeListList().hashCode();
            }
            hash = 37 * hash + 3;
            hash = 53 * hash + Internal.hashLong(this.getUnk2700ONOOJBEABOE());
            hash = 37 * hash + 7;
            hash = 53 * hash + this.unk2700ONCDLPDHFAB_;
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getTimeCost();
            hash = 37 * hash + 2;
            hash = 53 * hash + Internal.hashBoolean(this.getUnk2700IBDCFAMBGOK());
            hash = 37 * hash + 14;
            hash = 53 * hash + Internal.hashBoolean(this.getUnk2700HBFLKFOCKBF());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static CustomDungeonResultInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return CustomDungeonResultInfo.PARSER.parseFrom(data);
        }
        
        public static CustomDungeonResultInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CustomDungeonResultInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CustomDungeonResultInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return CustomDungeonResultInfo.PARSER.parseFrom(data);
        }
        
        public static CustomDungeonResultInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CustomDungeonResultInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CustomDungeonResultInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return CustomDungeonResultInfo.PARSER.parseFrom(data);
        }
        
        public static CustomDungeonResultInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CustomDungeonResultInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CustomDungeonResultInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CustomDungeonResultInfo.PARSER, input);
        }
        
        public static CustomDungeonResultInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CustomDungeonResultInfo.PARSER, input, extensionRegistry);
        }
        
        public static CustomDungeonResultInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CustomDungeonResultInfo.PARSER, input);
        }
        
        public static CustomDungeonResultInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CustomDungeonResultInfo.PARSER, input, extensionRegistry);
        }
        
        public static CustomDungeonResultInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CustomDungeonResultInfo.PARSER, input);
        }
        
        public static CustomDungeonResultInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CustomDungeonResultInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return CustomDungeonResultInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final CustomDungeonResultInfo prototype) {
            return CustomDungeonResultInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == CustomDungeonResultInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static CustomDungeonResultInfo getDefaultInstance() {
            return CustomDungeonResultInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<CustomDungeonResultInfo> parser() {
            return CustomDungeonResultInfo.PARSER;
        }
        
        @Override
        public Parser<CustomDungeonResultInfo> getParserForType() {
            return CustomDungeonResultInfo.PARSER;
        }
        
        @Override
        public CustomDungeonResultInfo getDefaultInstanceForType() {
            return CustomDungeonResultInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new CustomDungeonResultInfo();
            PARSER = new AbstractParser<CustomDungeonResultInfo>() {
                @Override
                public CustomDungeonResultInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new CustomDungeonResultInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CustomDungeonResultInfoOrBuilder
        {
            private int bitField0_;
            private boolean unk2700BONNHGKDLFO_;
            private int unk2700FBBEJKCDMEI_;
            private List<Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH> childChallengeList_;
            private RepeatedFieldBuilderV3<Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH, Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH.Builder, Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGHOrBuilder> childChallengeListBuilder_;
            private long unk2700ONOOJBEABOE_;
            private int unk2700ONCDLPDHFAB_;
            private int timeCost_;
            private boolean unk2700IBDCFAMBGOK_;
            private boolean unk2700HBFLKFOCKBF_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return CustomDungeonResultInfoOuterClass.internal_static_CustomDungeonResultInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return CustomDungeonResultInfoOuterClass.internal_static_CustomDungeonResultInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CustomDungeonResultInfo.class, Builder.class);
            }
            
            private Builder() {
                this.childChallengeList_ = Collections.emptyList();
                this.unk2700ONCDLPDHFAB_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.childChallengeList_ = Collections.emptyList();
                this.unk2700ONCDLPDHFAB_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (CustomDungeonResultInfo.alwaysUseFieldBuilders) {
                    this.getChildChallengeListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.unk2700BONNHGKDLFO_ = false;
                this.unk2700FBBEJKCDMEI_ = 0;
                if (this.childChallengeListBuilder_ == null) {
                    this.childChallengeList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.childChallengeListBuilder_.clear();
                }
                this.unk2700ONOOJBEABOE_ = 0L;
                this.unk2700ONCDLPDHFAB_ = 0;
                this.timeCost_ = 0;
                this.unk2700IBDCFAMBGOK_ = false;
                this.unk2700HBFLKFOCKBF_ = false;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return CustomDungeonResultInfoOuterClass.internal_static_CustomDungeonResultInfo_descriptor;
            }
            
            @Override
            public CustomDungeonResultInfo getDefaultInstanceForType() {
                return CustomDungeonResultInfo.getDefaultInstance();
            }
            
            @Override
            public CustomDungeonResultInfo build() {
                final CustomDungeonResultInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public CustomDungeonResultInfo buildPartial() {
                final CustomDungeonResultInfo result = new CustomDungeonResultInfo(this);
                final int from_bitField0_ = this.bitField0_;
                result.unk2700BONNHGKDLFO_ = this.unk2700BONNHGKDLFO_;
                result.unk2700FBBEJKCDMEI_ = this.unk2700FBBEJKCDMEI_;
                if (this.childChallengeListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.childChallengeList_ = Collections.unmodifiableList((List<? extends Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH>)this.childChallengeList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.childChallengeList_ = this.childChallengeList_;
                }
                else {
                    result.childChallengeList_ = this.childChallengeListBuilder_.build();
                }
                result.unk2700ONOOJBEABOE_ = this.unk2700ONOOJBEABOE_;
                result.unk2700ONCDLPDHFAB_ = this.unk2700ONCDLPDHFAB_;
                result.timeCost_ = this.timeCost_;
                result.unk2700IBDCFAMBGOK_ = this.unk2700IBDCFAMBGOK_;
                result.unk2700HBFLKFOCKBF_ = this.unk2700HBFLKFOCKBF_;
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
                if (other instanceof CustomDungeonResultInfo) {
                    return this.mergeFrom((CustomDungeonResultInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final CustomDungeonResultInfo other) {
                if (other == CustomDungeonResultInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getUnk2700BONNHGKDLFO()) {
                    this.setUnk2700BONNHGKDLFO(other.getUnk2700BONNHGKDLFO());
                }
                if (other.getUnk2700FBBEJKCDMEI() != 0) {
                    this.setUnk2700FBBEJKCDMEI(other.getUnk2700FBBEJKCDMEI());
                }
                if (this.childChallengeListBuilder_ == null) {
                    if (!other.childChallengeList_.isEmpty()) {
                        if (this.childChallengeList_.isEmpty()) {
                            this.childChallengeList_ = other.childChallengeList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureChildChallengeListIsMutable();
                            this.childChallengeList_.addAll(other.childChallengeList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.childChallengeList_.isEmpty()) {
                    if (this.childChallengeListBuilder_.isEmpty()) {
                        this.childChallengeListBuilder_.dispose();
                        this.childChallengeListBuilder_ = null;
                        this.childChallengeList_ = other.childChallengeList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.childChallengeListBuilder_ = (CustomDungeonResultInfo.alwaysUseFieldBuilders ? this.getChildChallengeListFieldBuilder() : null);
                    }
                    else {
                        this.childChallengeListBuilder_.addAllMessages(other.childChallengeList_);
                    }
                }
                if (other.getUnk2700ONOOJBEABOE() != 0L) {
                    this.setUnk2700ONOOJBEABOE(other.getUnk2700ONOOJBEABOE());
                }
                if (other.unk2700ONCDLPDHFAB_ != 0) {
                    this.setUnk2700ONCDLPDHFABValue(other.getUnk2700ONCDLPDHFABValue());
                }
                if (other.getTimeCost() != 0) {
                    this.setTimeCost(other.getTimeCost());
                }
                if (other.getUnk2700IBDCFAMBGOK()) {
                    this.setUnk2700IBDCFAMBGOK(other.getUnk2700IBDCFAMBGOK());
                }
                if (other.getUnk2700HBFLKFOCKBF()) {
                    this.setUnk2700HBFLKFOCKBF(other.getUnk2700HBFLKFOCKBF());
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
                CustomDungeonResultInfo parsedMessage = null;
                try {
                    parsedMessage = CustomDungeonResultInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (CustomDungeonResultInfo)e.getUnfinishedMessage();
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
            public boolean getUnk2700BONNHGKDLFO() {
                return this.unk2700BONNHGKDLFO_;
            }
            
            public Builder setUnk2700BONNHGKDLFO(final boolean value) {
                this.unk2700BONNHGKDLFO_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700BONNHGKDLFO() {
                this.unk2700BONNHGKDLFO_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUnk2700FBBEJKCDMEI() {
                return this.unk2700FBBEJKCDMEI_;
            }
            
            public Builder setUnk2700FBBEJKCDMEI(final int value) {
                this.unk2700FBBEJKCDMEI_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700FBBEJKCDMEI() {
                this.unk2700FBBEJKCDMEI_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureChildChallengeListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.childChallengeList_ = new ArrayList<Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH>(this.childChallengeList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH> getChildChallengeListList() {
                if (this.childChallengeListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH>)this.childChallengeList_);
                }
                return this.childChallengeListBuilder_.getMessageList();
            }
            
            @Override
            public int getChildChallengeListCount() {
                if (this.childChallengeListBuilder_ == null) {
                    return this.childChallengeList_.size();
                }
                return this.childChallengeListBuilder_.getCount();
            }
            
            @Override
            public Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH getChildChallengeList(final int index) {
                if (this.childChallengeListBuilder_ == null) {
                    return this.childChallengeList_.get(index);
                }
                return this.childChallengeListBuilder_.getMessage(index);
            }
            
            public Builder setChildChallengeList(final int index, final Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH value) {
                if (this.childChallengeListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureChildChallengeListIsMutable();
                    this.childChallengeList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.childChallengeListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setChildChallengeList(final int index, final Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH.Builder builderForValue) {
                if (this.childChallengeListBuilder_ == null) {
                    this.ensureChildChallengeListIsMutable();
                    this.childChallengeList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.childChallengeListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addChildChallengeList(final Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH value) {
                if (this.childChallengeListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureChildChallengeListIsMutable();
                    this.childChallengeList_.add(value);
                    this.onChanged();
                }
                else {
                    this.childChallengeListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addChildChallengeList(final int index, final Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH value) {
                if (this.childChallengeListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureChildChallengeListIsMutable();
                    this.childChallengeList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.childChallengeListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addChildChallengeList(final Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH.Builder builderForValue) {
                if (this.childChallengeListBuilder_ == null) {
                    this.ensureChildChallengeListIsMutable();
                    this.childChallengeList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.childChallengeListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addChildChallengeList(final int index, final Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH.Builder builderForValue) {
                if (this.childChallengeListBuilder_ == null) {
                    this.ensureChildChallengeListIsMutable();
                    this.childChallengeList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.childChallengeListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllChildChallengeList(final Iterable<? extends Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH> values) {
                if (this.childChallengeListBuilder_ == null) {
                    this.ensureChildChallengeListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.childChallengeList_);
                    this.onChanged();
                }
                else {
                    this.childChallengeListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearChildChallengeList() {
                if (this.childChallengeListBuilder_ == null) {
                    this.childChallengeList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.childChallengeListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeChildChallengeList(final int index) {
                if (this.childChallengeListBuilder_ == null) {
                    this.ensureChildChallengeListIsMutable();
                    this.childChallengeList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.childChallengeListBuilder_.remove(index);
                }
                return this;
            }
            
            public Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH.Builder getChildChallengeListBuilder(final int index) {
                return this.getChildChallengeListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGHOrBuilder getChildChallengeListOrBuilder(final int index) {
                if (this.childChallengeListBuilder_ == null) {
                    return this.childChallengeList_.get(index);
                }
                return this.childChallengeListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGHOrBuilder> getChildChallengeListOrBuilderList() {
                if (this.childChallengeListBuilder_ != null) {
                    return this.childChallengeListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGHOrBuilder>)this.childChallengeList_);
            }
            
            public Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH.Builder addChildChallengeListBuilder() {
                return this.getChildChallengeListFieldBuilder().addBuilder(Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH.getDefaultInstance());
            }
            
            public Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH.Builder addChildChallengeListBuilder(final int index) {
                return this.getChildChallengeListFieldBuilder().addBuilder(index, Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH.getDefaultInstance());
            }
            
            public List<Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH.Builder> getChildChallengeListBuilderList() {
                return this.getChildChallengeListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH, Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH.Builder, Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGHOrBuilder> getChildChallengeListFieldBuilder() {
                if (this.childChallengeListBuilder_ == null) {
                    this.childChallengeListBuilder_ = new RepeatedFieldBuilderV3<Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH, Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH.Builder, Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGHOrBuilder>(this.childChallengeList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.childChallengeList_ = null;
                }
                return this.childChallengeListBuilder_;
            }
            
            @Override
            public long getUnk2700ONOOJBEABOE() {
                return this.unk2700ONOOJBEABOE_;
            }
            
            public Builder setUnk2700ONOOJBEABOE(final long value) {
                this.unk2700ONOOJBEABOE_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700ONOOJBEABOE() {
                this.unk2700ONOOJBEABOE_ = 0L;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUnk2700ONCDLPDHFABValue() {
                return this.unk2700ONCDLPDHFAB_;
            }
            
            public Builder setUnk2700ONCDLPDHFABValue(final int value) {
                this.unk2700ONCDLPDHFAB_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public Unk2700OCOKILBJIPJ.Unk2700_OCOKILBJIPJ getUnk2700ONCDLPDHFAB() {
                final Unk2700OCOKILBJIPJ.Unk2700_OCOKILBJIPJ result = Unk2700OCOKILBJIPJ.Unk2700_OCOKILBJIPJ.valueOf(this.unk2700ONCDLPDHFAB_);
                return (result == null) ? Unk2700OCOKILBJIPJ.Unk2700_OCOKILBJIPJ.UNRECOGNIZED : result;
            }
            
            public Builder setUnk2700ONCDLPDHFAB(final Unk2700OCOKILBJIPJ.Unk2700_OCOKILBJIPJ value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.unk2700ONCDLPDHFAB_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700ONCDLPDHFAB() {
                this.unk2700ONCDLPDHFAB_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getTimeCost() {
                return this.timeCost_;
            }
            
            public Builder setTimeCost(final int value) {
                this.timeCost_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTimeCost() {
                this.timeCost_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getUnk2700IBDCFAMBGOK() {
                return this.unk2700IBDCFAMBGOK_;
            }
            
            public Builder setUnk2700IBDCFAMBGOK(final boolean value) {
                this.unk2700IBDCFAMBGOK_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700IBDCFAMBGOK() {
                this.unk2700IBDCFAMBGOK_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getUnk2700HBFLKFOCKBF() {
                return this.unk2700HBFLKFOCKBF_;
            }
            
            public Builder setUnk2700HBFLKFOCKBF(final boolean value) {
                this.unk2700HBFLKFOCKBF_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700HBFLKFOCKBF() {
                this.unk2700HBFLKFOCKBF_ = false;
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
    
    public interface CustomDungeonResultInfoOrBuilder extends MessageOrBuilder
    {
        boolean getUnk2700BONNHGKDLFO();
        
        int getUnk2700FBBEJKCDMEI();
        
        List<Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH> getChildChallengeListList();
        
        Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH getChildChallengeList(final int p0);
        
        int getChildChallengeListCount();
        
        List<? extends Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGHOrBuilder> getChildChallengeListOrBuilderList();
        
        Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGHOrBuilder getChildChallengeListOrBuilder(final int p0);
        
        long getUnk2700ONOOJBEABOE();
        
        int getUnk2700ONCDLPDHFABValue();
        
        Unk2700OCOKILBJIPJ.Unk2700_OCOKILBJIPJ getUnk2700ONCDLPDHFAB();
        
        int getTimeCost();
        
        boolean getUnk2700IBDCFAMBGOK();
        
        boolean getUnk2700HBFLKFOCKBF();
    }
}
