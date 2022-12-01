// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
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
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class FurnitureMakeRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_FurnitureMakeRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_FurnitureMakeRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private FurnitureMakeRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return FurnitureMakeRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016FurnitureMakeRsp.proto\u001a\u001fFurnitureMakeBeHelpedData.proto\u001a\u001bFurnitureMakeHelpData.proto\u001a\u001bFurnitureMakeMakeInfo.proto\u001a\u0017FurnitureMakeSlot.proto\"\u00ea\u0001\n\u0010FurnitureMakeRsp\u00124\n\u0010helped_data_list\u0018\r \u0003(\u000b2\u001a.FurnitureMakeBeHelpedData\u0012.\n\u000emake_info_list\u0018\u0004 \u0003(\u000b2\u0016.FurnitureMakeMakeInfo\u0012/\n\u0013furniture_make_slot\u0018\u0001 \u0001(\u000b2\u0012.FurnitureMakeSlot\u0012\u000f\n\u0007retcode\u0018\u0003 \u0001(\u0005\u0012.\n\u000ehelp_data_list\u0018\u0002 \u0003(\u000b2\u0016.FurnitureMakeHelpDataB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        FurnitureMakeRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { FurnitureMakeBeHelpedDataOuterClass.getDescriptor(), FurnitureMakeHelpDataOuterClass.getDescriptor(), FurnitureMakeMakeInfoOuterClass.getDescriptor(), FurnitureMakeSlotOuterClass.getDescriptor() });
        internal_static_FurnitureMakeRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_FurnitureMakeRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(FurnitureMakeRspOuterClass.internal_static_FurnitureMakeRsp_descriptor, new String[] { "HelpedDataList", "MakeInfoList", "FurnitureMakeSlot", "Retcode", "HelpDataList" });
        FurnitureMakeBeHelpedDataOuterClass.getDescriptor();
        FurnitureMakeHelpDataOuterClass.getDescriptor();
        FurnitureMakeMakeInfoOuterClass.getDescriptor();
        FurnitureMakeSlotOuterClass.getDescriptor();
    }
    
    public static final class FurnitureMakeRsp extends GeneratedMessageV3 implements FurnitureMakeRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int HELPED_DATA_LIST_FIELD_NUMBER = 13;
        private List<FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData> helpedDataList_;
        public static final int MAKE_INFO_LIST_FIELD_NUMBER = 4;
        private List<FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo> makeInfoList_;
        public static final int FURNITURE_MAKE_SLOT_FIELD_NUMBER = 1;
        private FurnitureMakeSlotOuterClass.FurnitureMakeSlot furnitureMakeSlot_;
        public static final int RETCODE_FIELD_NUMBER = 3;
        private int retcode_;
        public static final int HELP_DATA_LIST_FIELD_NUMBER = 2;
        private List<FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData> helpDataList_;
        private byte memoizedIsInitialized;
        private static final FurnitureMakeRsp DEFAULT_INSTANCE;
        private static final Parser<FurnitureMakeRsp> PARSER;
        
        private FurnitureMakeRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private FurnitureMakeRsp() {
            this.memoizedIsInitialized = -1;
            this.helpedDataList_ = Collections.emptyList();
            this.makeInfoList_ = Collections.emptyList();
            this.helpDataList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new FurnitureMakeRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private FurnitureMakeRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 10: {
                            FurnitureMakeSlotOuterClass.FurnitureMakeSlot.Builder subBuilder = null;
                            if (this.furnitureMakeSlot_ != null) {
                                subBuilder = this.furnitureMakeSlot_.toBuilder();
                            }
                            this.furnitureMakeSlot_ = input.readMessage(FurnitureMakeSlotOuterClass.FurnitureMakeSlot.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.furnitureMakeSlot_);
                                this.furnitureMakeSlot_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 18: {
                            if ((mutable_bitField0_ & 0x4) == 0x0) {
                                this.helpDataList_ = new ArrayList<FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData>();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.helpDataList_.add(input.readMessage(FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData.parser(), extensionRegistry));
                            continue;
                        }
                        case 24: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 34: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.makeInfoList_ = new ArrayList<FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo>();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.makeInfoList_.add(input.readMessage(FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo.parser(), extensionRegistry));
                            continue;
                        }
                        case 106: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.helpedDataList_ = new ArrayList<FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.helpedDataList_.add(input.readMessage(FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData.parser(), extensionRegistry));
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
                if ((mutable_bitField0_ & 0x4) != 0x0) {
                    this.helpDataList_ = Collections.unmodifiableList((List<? extends FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData>)this.helpDataList_);
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.makeInfoList_ = Collections.unmodifiableList((List<? extends FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo>)this.makeInfoList_);
                }
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.helpedDataList_ = Collections.unmodifiableList((List<? extends FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData>)this.helpedDataList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return FurnitureMakeRspOuterClass.internal_static_FurnitureMakeRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return FurnitureMakeRspOuterClass.internal_static_FurnitureMakeRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(FurnitureMakeRsp.class, Builder.class);
        }
        
        @Override
        public List<FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData> getHelpedDataListList() {
            return this.helpedDataList_;
        }
        
        @Override
        public List<? extends FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedDataOrBuilder> getHelpedDataListOrBuilderList() {
            return this.helpedDataList_;
        }
        
        @Override
        public int getHelpedDataListCount() {
            return this.helpedDataList_.size();
        }
        
        @Override
        public FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData getHelpedDataList(final int index) {
            return this.helpedDataList_.get(index);
        }
        
        @Override
        public FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedDataOrBuilder getHelpedDataListOrBuilder(final int index) {
            return this.helpedDataList_.get(index);
        }
        
        @Override
        public List<FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo> getMakeInfoListList() {
            return this.makeInfoList_;
        }
        
        @Override
        public List<? extends FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfoOrBuilder> getMakeInfoListOrBuilderList() {
            return this.makeInfoList_;
        }
        
        @Override
        public int getMakeInfoListCount() {
            return this.makeInfoList_.size();
        }
        
        @Override
        public FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo getMakeInfoList(final int index) {
            return this.makeInfoList_.get(index);
        }
        
        @Override
        public FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfoOrBuilder getMakeInfoListOrBuilder(final int index) {
            return this.makeInfoList_.get(index);
        }
        
        @Override
        public boolean hasFurnitureMakeSlot() {
            return this.furnitureMakeSlot_ != null;
        }
        
        @Override
        public FurnitureMakeSlotOuterClass.FurnitureMakeSlot getFurnitureMakeSlot() {
            return (this.furnitureMakeSlot_ == null) ? FurnitureMakeSlotOuterClass.FurnitureMakeSlot.getDefaultInstance() : this.furnitureMakeSlot_;
        }
        
        @Override
        public FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder getFurnitureMakeSlotOrBuilder() {
            return this.getFurnitureMakeSlot();
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public List<FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData> getHelpDataListList() {
            return this.helpDataList_;
        }
        
        @Override
        public List<? extends FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpDataOrBuilder> getHelpDataListOrBuilderList() {
            return this.helpDataList_;
        }
        
        @Override
        public int getHelpDataListCount() {
            return this.helpDataList_.size();
        }
        
        @Override
        public FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData getHelpDataList(final int index) {
            return this.helpDataList_.get(index);
        }
        
        @Override
        public FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpDataOrBuilder getHelpDataListOrBuilder(final int index) {
            return this.helpDataList_.get(index);
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
            if (this.furnitureMakeSlot_ != null) {
                output.writeMessage(1, this.getFurnitureMakeSlot());
            }
            for (int i = 0; i < this.helpDataList_.size(); ++i) {
                output.writeMessage(2, this.helpDataList_.get(i));
            }
            if (this.retcode_ != 0) {
                output.writeInt32(3, this.retcode_);
            }
            for (int i = 0; i < this.makeInfoList_.size(); ++i) {
                output.writeMessage(4, this.makeInfoList_.get(i));
            }
            for (int i = 0; i < this.helpedDataList_.size(); ++i) {
                output.writeMessage(13, this.helpedDataList_.get(i));
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
            if (this.furnitureMakeSlot_ != null) {
                size += CodedOutputStream.computeMessageSize(1, this.getFurnitureMakeSlot());
            }
            for (int i = 0; i < this.helpDataList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(2, this.helpDataList_.get(i));
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(3, this.retcode_);
            }
            for (int i = 0; i < this.makeInfoList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(4, this.makeInfoList_.get(i));
            }
            for (int i = 0; i < this.helpedDataList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(13, this.helpedDataList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FurnitureMakeRsp)) {
                return super.equals(obj);
            }
            final FurnitureMakeRsp other = (FurnitureMakeRsp)obj;
            return this.getHelpedDataListList().equals(other.getHelpedDataListList()) && this.getMakeInfoListList().equals(other.getMakeInfoListList()) && this.hasFurnitureMakeSlot() == other.hasFurnitureMakeSlot() && (!this.hasFurnitureMakeSlot() || this.getFurnitureMakeSlot().equals(other.getFurnitureMakeSlot())) && this.getRetcode() == other.getRetcode() && this.getHelpDataListList().equals(other.getHelpDataListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getHelpedDataListCount() > 0) {
                hash = 37 * hash + 13;
                hash = 53 * hash + this.getHelpedDataListList().hashCode();
            }
            if (this.getMakeInfoListCount() > 0) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.getMakeInfoListList().hashCode();
            }
            if (this.hasFurnitureMakeSlot()) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getFurnitureMakeSlot().hashCode();
            }
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getRetcode();
            if (this.getHelpDataListCount() > 0) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getHelpDataListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static FurnitureMakeRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return FurnitureMakeRsp.PARSER.parseFrom(data);
        }
        
        public static FurnitureMakeRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FurnitureMakeRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FurnitureMakeRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return FurnitureMakeRsp.PARSER.parseFrom(data);
        }
        
        public static FurnitureMakeRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FurnitureMakeRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FurnitureMakeRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return FurnitureMakeRsp.PARSER.parseFrom(data);
        }
        
        public static FurnitureMakeRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FurnitureMakeRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FurnitureMakeRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FurnitureMakeRsp.PARSER, input);
        }
        
        public static FurnitureMakeRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FurnitureMakeRsp.PARSER, input, extensionRegistry);
        }
        
        public static FurnitureMakeRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FurnitureMakeRsp.PARSER, input);
        }
        
        public static FurnitureMakeRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FurnitureMakeRsp.PARSER, input, extensionRegistry);
        }
        
        public static FurnitureMakeRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FurnitureMakeRsp.PARSER, input);
        }
        
        public static FurnitureMakeRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FurnitureMakeRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return FurnitureMakeRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final FurnitureMakeRsp prototype) {
            return FurnitureMakeRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == FurnitureMakeRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static FurnitureMakeRsp getDefaultInstance() {
            return FurnitureMakeRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<FurnitureMakeRsp> parser() {
            return FurnitureMakeRsp.PARSER;
        }
        
        @Override
        public Parser<FurnitureMakeRsp> getParserForType() {
            return FurnitureMakeRsp.PARSER;
        }
        
        @Override
        public FurnitureMakeRsp getDefaultInstanceForType() {
            return FurnitureMakeRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new FurnitureMakeRsp();
            PARSER = new AbstractParser<FurnitureMakeRsp>() {
                @Override
                public FurnitureMakeRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new FurnitureMakeRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FurnitureMakeRspOrBuilder
        {
            private int bitField0_;
            private List<FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData> helpedDataList_;
            private RepeatedFieldBuilderV3<FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData, FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData.Builder, FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedDataOrBuilder> helpedDataListBuilder_;
            private List<FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo> makeInfoList_;
            private RepeatedFieldBuilderV3<FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo, FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo.Builder, FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfoOrBuilder> makeInfoListBuilder_;
            private FurnitureMakeSlotOuterClass.FurnitureMakeSlot furnitureMakeSlot_;
            private SingleFieldBuilderV3<FurnitureMakeSlotOuterClass.FurnitureMakeSlot, FurnitureMakeSlotOuterClass.FurnitureMakeSlot.Builder, FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder> furnitureMakeSlotBuilder_;
            private int retcode_;
            private List<FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData> helpDataList_;
            private RepeatedFieldBuilderV3<FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData, FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData.Builder, FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpDataOrBuilder> helpDataListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return FurnitureMakeRspOuterClass.internal_static_FurnitureMakeRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return FurnitureMakeRspOuterClass.internal_static_FurnitureMakeRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(FurnitureMakeRsp.class, Builder.class);
            }
            
            private Builder() {
                this.helpedDataList_ = Collections.emptyList();
                this.makeInfoList_ = Collections.emptyList();
                this.helpDataList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.helpedDataList_ = Collections.emptyList();
                this.makeInfoList_ = Collections.emptyList();
                this.helpDataList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (FurnitureMakeRsp.alwaysUseFieldBuilders) {
                    this.getHelpedDataListFieldBuilder();
                    this.getMakeInfoListFieldBuilder();
                    this.getHelpDataListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.helpedDataListBuilder_ == null) {
                    this.helpedDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.helpedDataListBuilder_.clear();
                }
                if (this.makeInfoListBuilder_ == null) {
                    this.makeInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                else {
                    this.makeInfoListBuilder_.clear();
                }
                if (this.furnitureMakeSlotBuilder_ == null) {
                    this.furnitureMakeSlot_ = null;
                }
                else {
                    this.furnitureMakeSlot_ = null;
                    this.furnitureMakeSlotBuilder_ = null;
                }
                this.retcode_ = 0;
                if (this.helpDataListBuilder_ == null) {
                    this.helpDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                }
                else {
                    this.helpDataListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return FurnitureMakeRspOuterClass.internal_static_FurnitureMakeRsp_descriptor;
            }
            
            @Override
            public FurnitureMakeRsp getDefaultInstanceForType() {
                return FurnitureMakeRsp.getDefaultInstance();
            }
            
            @Override
            public FurnitureMakeRsp build() {
                final FurnitureMakeRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public FurnitureMakeRsp buildPartial() {
                final FurnitureMakeRsp result = new FurnitureMakeRsp(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.helpedDataListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.helpedDataList_ = Collections.unmodifiableList((List<? extends FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData>)this.helpedDataList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.helpedDataList_ = this.helpedDataList_;
                }
                else {
                    result.helpedDataList_ = this.helpedDataListBuilder_.build();
                }
                if (this.makeInfoListBuilder_ == null) {
                    if ((this.bitField0_ & 0x2) != 0x0) {
                        this.makeInfoList_ = Collections.unmodifiableList((List<? extends FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo>)this.makeInfoList_);
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    result.makeInfoList_ = this.makeInfoList_;
                }
                else {
                    result.makeInfoList_ = this.makeInfoListBuilder_.build();
                }
                if (this.furnitureMakeSlotBuilder_ == null) {
                    result.furnitureMakeSlot_ = this.furnitureMakeSlot_;
                }
                else {
                    result.furnitureMakeSlot_ = this.furnitureMakeSlotBuilder_.build();
                }
                result.retcode_ = this.retcode_;
                if (this.helpDataListBuilder_ == null) {
                    if ((this.bitField0_ & 0x4) != 0x0) {
                        this.helpDataList_ = Collections.unmodifiableList((List<? extends FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData>)this.helpDataList_);
                        this.bitField0_ &= 0xFFFFFFFB;
                    }
                    result.helpDataList_ = this.helpDataList_;
                }
                else {
                    result.helpDataList_ = this.helpDataListBuilder_.build();
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
                if (other instanceof FurnitureMakeRsp) {
                    return this.mergeFrom((FurnitureMakeRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final FurnitureMakeRsp other) {
                if (other == FurnitureMakeRsp.getDefaultInstance()) {
                    return this;
                }
                if (this.helpedDataListBuilder_ == null) {
                    if (!other.helpedDataList_.isEmpty()) {
                        if (this.helpedDataList_.isEmpty()) {
                            this.helpedDataList_ = other.helpedDataList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureHelpedDataListIsMutable();
                            this.helpedDataList_.addAll(other.helpedDataList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.helpedDataList_.isEmpty()) {
                    if (this.helpedDataListBuilder_.isEmpty()) {
                        this.helpedDataListBuilder_.dispose();
                        this.helpedDataListBuilder_ = null;
                        this.helpedDataList_ = other.helpedDataList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.helpedDataListBuilder_ = (FurnitureMakeRsp.alwaysUseFieldBuilders ? this.getHelpedDataListFieldBuilder() : null);
                    }
                    else {
                        this.helpedDataListBuilder_.addAllMessages(other.helpedDataList_);
                    }
                }
                if (this.makeInfoListBuilder_ == null) {
                    if (!other.makeInfoList_.isEmpty()) {
                        if (this.makeInfoList_.isEmpty()) {
                            this.makeInfoList_ = other.makeInfoList_;
                            this.bitField0_ &= 0xFFFFFFFD;
                        }
                        else {
                            this.ensureMakeInfoListIsMutable();
                            this.makeInfoList_.addAll(other.makeInfoList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.makeInfoList_.isEmpty()) {
                    if (this.makeInfoListBuilder_.isEmpty()) {
                        this.makeInfoListBuilder_.dispose();
                        this.makeInfoListBuilder_ = null;
                        this.makeInfoList_ = other.makeInfoList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                        this.makeInfoListBuilder_ = (FurnitureMakeRsp.alwaysUseFieldBuilders ? this.getMakeInfoListFieldBuilder() : null);
                    }
                    else {
                        this.makeInfoListBuilder_.addAllMessages(other.makeInfoList_);
                    }
                }
                if (other.hasFurnitureMakeSlot()) {
                    this.mergeFurnitureMakeSlot(other.getFurnitureMakeSlot());
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (this.helpDataListBuilder_ == null) {
                    if (!other.helpDataList_.isEmpty()) {
                        if (this.helpDataList_.isEmpty()) {
                            this.helpDataList_ = other.helpDataList_;
                            this.bitField0_ &= 0xFFFFFFFB;
                        }
                        else {
                            this.ensureHelpDataListIsMutable();
                            this.helpDataList_.addAll(other.helpDataList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.helpDataList_.isEmpty()) {
                    if (this.helpDataListBuilder_.isEmpty()) {
                        this.helpDataListBuilder_.dispose();
                        this.helpDataListBuilder_ = null;
                        this.helpDataList_ = other.helpDataList_;
                        this.bitField0_ &= 0xFFFFFFFB;
                        this.helpDataListBuilder_ = (FurnitureMakeRsp.alwaysUseFieldBuilders ? this.getHelpDataListFieldBuilder() : null);
                    }
                    else {
                        this.helpDataListBuilder_.addAllMessages(other.helpDataList_);
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
                FurnitureMakeRsp parsedMessage = null;
                try {
                    parsedMessage = FurnitureMakeRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (FurnitureMakeRsp)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureHelpedDataListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.helpedDataList_ = new ArrayList<FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData>(this.helpedDataList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData> getHelpedDataListList() {
                if (this.helpedDataListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData>)this.helpedDataList_);
                }
                return this.helpedDataListBuilder_.getMessageList();
            }
            
            @Override
            public int getHelpedDataListCount() {
                if (this.helpedDataListBuilder_ == null) {
                    return this.helpedDataList_.size();
                }
                return this.helpedDataListBuilder_.getCount();
            }
            
            @Override
            public FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData getHelpedDataList(final int index) {
                if (this.helpedDataListBuilder_ == null) {
                    return this.helpedDataList_.get(index);
                }
                return this.helpedDataListBuilder_.getMessage(index);
            }
            
            public Builder setHelpedDataList(final int index, final FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData value) {
                if (this.helpedDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureHelpedDataListIsMutable();
                    this.helpedDataList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.helpedDataListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setHelpedDataList(final int index, final FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData.Builder builderForValue) {
                if (this.helpedDataListBuilder_ == null) {
                    this.ensureHelpedDataListIsMutable();
                    this.helpedDataList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.helpedDataListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addHelpedDataList(final FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData value) {
                if (this.helpedDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureHelpedDataListIsMutable();
                    this.helpedDataList_.add(value);
                    this.onChanged();
                }
                else {
                    this.helpedDataListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addHelpedDataList(final int index, final FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData value) {
                if (this.helpedDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureHelpedDataListIsMutable();
                    this.helpedDataList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.helpedDataListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addHelpedDataList(final FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData.Builder builderForValue) {
                if (this.helpedDataListBuilder_ == null) {
                    this.ensureHelpedDataListIsMutable();
                    this.helpedDataList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.helpedDataListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addHelpedDataList(final int index, final FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData.Builder builderForValue) {
                if (this.helpedDataListBuilder_ == null) {
                    this.ensureHelpedDataListIsMutable();
                    this.helpedDataList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.helpedDataListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllHelpedDataList(final Iterable<? extends FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData> values) {
                if (this.helpedDataListBuilder_ == null) {
                    this.ensureHelpedDataListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.helpedDataList_);
                    this.onChanged();
                }
                else {
                    this.helpedDataListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearHelpedDataList() {
                if (this.helpedDataListBuilder_ == null) {
                    this.helpedDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.helpedDataListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeHelpedDataList(final int index) {
                if (this.helpedDataListBuilder_ == null) {
                    this.ensureHelpedDataListIsMutable();
                    this.helpedDataList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.helpedDataListBuilder_.remove(index);
                }
                return this;
            }
            
            public FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData.Builder getHelpedDataListBuilder(final int index) {
                return this.getHelpedDataListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedDataOrBuilder getHelpedDataListOrBuilder(final int index) {
                if (this.helpedDataListBuilder_ == null) {
                    return this.helpedDataList_.get(index);
                }
                return this.helpedDataListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedDataOrBuilder> getHelpedDataListOrBuilderList() {
                if (this.helpedDataListBuilder_ != null) {
                    return this.helpedDataListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedDataOrBuilder>)this.helpedDataList_);
            }
            
            public FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData.Builder addHelpedDataListBuilder() {
                return this.getHelpedDataListFieldBuilder().addBuilder(FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData.getDefaultInstance());
            }
            
            public FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData.Builder addHelpedDataListBuilder(final int index) {
                return this.getHelpedDataListFieldBuilder().addBuilder(index, FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData.getDefaultInstance());
            }
            
            public List<FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData.Builder> getHelpedDataListBuilderList() {
                return this.getHelpedDataListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData, FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData.Builder, FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedDataOrBuilder> getHelpedDataListFieldBuilder() {
                if (this.helpedDataListBuilder_ == null) {
                    this.helpedDataListBuilder_ = new RepeatedFieldBuilderV3<FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData, FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData.Builder, FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedDataOrBuilder>(this.helpedDataList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.helpedDataList_ = null;
                }
                return this.helpedDataListBuilder_;
            }
            
            private void ensureMakeInfoListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.makeInfoList_ = new ArrayList<FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo>(this.makeInfoList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo> getMakeInfoListList() {
                if (this.makeInfoListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo>)this.makeInfoList_);
                }
                return this.makeInfoListBuilder_.getMessageList();
            }
            
            @Override
            public int getMakeInfoListCount() {
                if (this.makeInfoListBuilder_ == null) {
                    return this.makeInfoList_.size();
                }
                return this.makeInfoListBuilder_.getCount();
            }
            
            @Override
            public FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo getMakeInfoList(final int index) {
                if (this.makeInfoListBuilder_ == null) {
                    return this.makeInfoList_.get(index);
                }
                return this.makeInfoListBuilder_.getMessage(index);
            }
            
            public Builder setMakeInfoList(final int index, final FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo value) {
                if (this.makeInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureMakeInfoListIsMutable();
                    this.makeInfoList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.makeInfoListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setMakeInfoList(final int index, final FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo.Builder builderForValue) {
                if (this.makeInfoListBuilder_ == null) {
                    this.ensureMakeInfoListIsMutable();
                    this.makeInfoList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.makeInfoListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addMakeInfoList(final FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo value) {
                if (this.makeInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureMakeInfoListIsMutable();
                    this.makeInfoList_.add(value);
                    this.onChanged();
                }
                else {
                    this.makeInfoListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addMakeInfoList(final int index, final FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo value) {
                if (this.makeInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureMakeInfoListIsMutable();
                    this.makeInfoList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.makeInfoListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addMakeInfoList(final FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo.Builder builderForValue) {
                if (this.makeInfoListBuilder_ == null) {
                    this.ensureMakeInfoListIsMutable();
                    this.makeInfoList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.makeInfoListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addMakeInfoList(final int index, final FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo.Builder builderForValue) {
                if (this.makeInfoListBuilder_ == null) {
                    this.ensureMakeInfoListIsMutable();
                    this.makeInfoList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.makeInfoListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllMakeInfoList(final Iterable<? extends FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo> values) {
                if (this.makeInfoListBuilder_ == null) {
                    this.ensureMakeInfoListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.makeInfoList_);
                    this.onChanged();
                }
                else {
                    this.makeInfoListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearMakeInfoList() {
                if (this.makeInfoListBuilder_ == null) {
                    this.makeInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                    this.onChanged();
                }
                else {
                    this.makeInfoListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeMakeInfoList(final int index) {
                if (this.makeInfoListBuilder_ == null) {
                    this.ensureMakeInfoListIsMutable();
                    this.makeInfoList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.makeInfoListBuilder_.remove(index);
                }
                return this;
            }
            
            public FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo.Builder getMakeInfoListBuilder(final int index) {
                return this.getMakeInfoListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfoOrBuilder getMakeInfoListOrBuilder(final int index) {
                if (this.makeInfoListBuilder_ == null) {
                    return this.makeInfoList_.get(index);
                }
                return this.makeInfoListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfoOrBuilder> getMakeInfoListOrBuilderList() {
                if (this.makeInfoListBuilder_ != null) {
                    return this.makeInfoListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfoOrBuilder>)this.makeInfoList_);
            }
            
            public FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo.Builder addMakeInfoListBuilder() {
                return this.getMakeInfoListFieldBuilder().addBuilder(FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo.getDefaultInstance());
            }
            
            public FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo.Builder addMakeInfoListBuilder(final int index) {
                return this.getMakeInfoListFieldBuilder().addBuilder(index, FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo.getDefaultInstance());
            }
            
            public List<FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo.Builder> getMakeInfoListBuilderList() {
                return this.getMakeInfoListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo, FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo.Builder, FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfoOrBuilder> getMakeInfoListFieldBuilder() {
                if (this.makeInfoListBuilder_ == null) {
                    this.makeInfoListBuilder_ = new RepeatedFieldBuilderV3<FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo, FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo.Builder, FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfoOrBuilder>(this.makeInfoList_, (this.bitField0_ & 0x2) != 0x0, this.getParentForChildren(), this.isClean());
                    this.makeInfoList_ = null;
                }
                return this.makeInfoListBuilder_;
            }
            
            @Override
            public boolean hasFurnitureMakeSlot() {
                return this.furnitureMakeSlotBuilder_ != null || this.furnitureMakeSlot_ != null;
            }
            
            @Override
            public FurnitureMakeSlotOuterClass.FurnitureMakeSlot getFurnitureMakeSlot() {
                if (this.furnitureMakeSlotBuilder_ == null) {
                    return (this.furnitureMakeSlot_ == null) ? FurnitureMakeSlotOuterClass.FurnitureMakeSlot.getDefaultInstance() : this.furnitureMakeSlot_;
                }
                return this.furnitureMakeSlotBuilder_.getMessage();
            }
            
            public Builder setFurnitureMakeSlot(final FurnitureMakeSlotOuterClass.FurnitureMakeSlot value) {
                if (this.furnitureMakeSlotBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.furnitureMakeSlot_ = value;
                    this.onChanged();
                }
                else {
                    this.furnitureMakeSlotBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setFurnitureMakeSlot(final FurnitureMakeSlotOuterClass.FurnitureMakeSlot.Builder builderForValue) {
                if (this.furnitureMakeSlotBuilder_ == null) {
                    this.furnitureMakeSlot_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.furnitureMakeSlotBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeFurnitureMakeSlot(final FurnitureMakeSlotOuterClass.FurnitureMakeSlot value) {
                if (this.furnitureMakeSlotBuilder_ == null) {
                    if (this.furnitureMakeSlot_ != null) {
                        this.furnitureMakeSlot_ = FurnitureMakeSlotOuterClass.FurnitureMakeSlot.newBuilder(this.furnitureMakeSlot_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.furnitureMakeSlot_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.furnitureMakeSlotBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearFurnitureMakeSlot() {
                if (this.furnitureMakeSlotBuilder_ == null) {
                    this.furnitureMakeSlot_ = null;
                    this.onChanged();
                }
                else {
                    this.furnitureMakeSlot_ = null;
                    this.furnitureMakeSlotBuilder_ = null;
                }
                return this;
            }
            
            public FurnitureMakeSlotOuterClass.FurnitureMakeSlot.Builder getFurnitureMakeSlotBuilder() {
                this.onChanged();
                return this.getFurnitureMakeSlotFieldBuilder().getBuilder();
            }
            
            @Override
            public FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder getFurnitureMakeSlotOrBuilder() {
                if (this.furnitureMakeSlotBuilder_ != null) {
                    return this.furnitureMakeSlotBuilder_.getMessageOrBuilder();
                }
                return (this.furnitureMakeSlot_ == null) ? FurnitureMakeSlotOuterClass.FurnitureMakeSlot.getDefaultInstance() : this.furnitureMakeSlot_;
            }
            
            private SingleFieldBuilderV3<FurnitureMakeSlotOuterClass.FurnitureMakeSlot, FurnitureMakeSlotOuterClass.FurnitureMakeSlot.Builder, FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder> getFurnitureMakeSlotFieldBuilder() {
                if (this.furnitureMakeSlotBuilder_ == null) {
                    this.furnitureMakeSlotBuilder_ = new SingleFieldBuilderV3<FurnitureMakeSlotOuterClass.FurnitureMakeSlot, FurnitureMakeSlotOuterClass.FurnitureMakeSlot.Builder, FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder>(this.getFurnitureMakeSlot(), this.getParentForChildren(), this.isClean());
                    this.furnitureMakeSlot_ = null;
                }
                return this.furnitureMakeSlotBuilder_;
            }
            
            @Override
            public int getRetcode() {
                return this.retcode_;
            }
            
            public Builder setRetcode(final int value) {
                this.retcode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRetcode() {
                this.retcode_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureHelpDataListIsMutable() {
                if ((this.bitField0_ & 0x4) == 0x0) {
                    this.helpDataList_ = new ArrayList<FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData>(this.helpDataList_);
                    this.bitField0_ |= 0x4;
                }
            }
            
            @Override
            public List<FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData> getHelpDataListList() {
                if (this.helpDataListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData>)this.helpDataList_);
                }
                return this.helpDataListBuilder_.getMessageList();
            }
            
            @Override
            public int getHelpDataListCount() {
                if (this.helpDataListBuilder_ == null) {
                    return this.helpDataList_.size();
                }
                return this.helpDataListBuilder_.getCount();
            }
            
            @Override
            public FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData getHelpDataList(final int index) {
                if (this.helpDataListBuilder_ == null) {
                    return this.helpDataList_.get(index);
                }
                return this.helpDataListBuilder_.getMessage(index);
            }
            
            public Builder setHelpDataList(final int index, final FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData value) {
                if (this.helpDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureHelpDataListIsMutable();
                    this.helpDataList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.helpDataListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setHelpDataList(final int index, final FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData.Builder builderForValue) {
                if (this.helpDataListBuilder_ == null) {
                    this.ensureHelpDataListIsMutable();
                    this.helpDataList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.helpDataListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addHelpDataList(final FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData value) {
                if (this.helpDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureHelpDataListIsMutable();
                    this.helpDataList_.add(value);
                    this.onChanged();
                }
                else {
                    this.helpDataListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addHelpDataList(final int index, final FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData value) {
                if (this.helpDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureHelpDataListIsMutable();
                    this.helpDataList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.helpDataListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addHelpDataList(final FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData.Builder builderForValue) {
                if (this.helpDataListBuilder_ == null) {
                    this.ensureHelpDataListIsMutable();
                    this.helpDataList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.helpDataListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addHelpDataList(final int index, final FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData.Builder builderForValue) {
                if (this.helpDataListBuilder_ == null) {
                    this.ensureHelpDataListIsMutable();
                    this.helpDataList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.helpDataListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllHelpDataList(final Iterable<? extends FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData> values) {
                if (this.helpDataListBuilder_ == null) {
                    this.ensureHelpDataListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.helpDataList_);
                    this.onChanged();
                }
                else {
                    this.helpDataListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearHelpDataList() {
                if (this.helpDataListBuilder_ == null) {
                    this.helpDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                    this.onChanged();
                }
                else {
                    this.helpDataListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeHelpDataList(final int index) {
                if (this.helpDataListBuilder_ == null) {
                    this.ensureHelpDataListIsMutable();
                    this.helpDataList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.helpDataListBuilder_.remove(index);
                }
                return this;
            }
            
            public FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData.Builder getHelpDataListBuilder(final int index) {
                return this.getHelpDataListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpDataOrBuilder getHelpDataListOrBuilder(final int index) {
                if (this.helpDataListBuilder_ == null) {
                    return this.helpDataList_.get(index);
                }
                return this.helpDataListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpDataOrBuilder> getHelpDataListOrBuilderList() {
                if (this.helpDataListBuilder_ != null) {
                    return this.helpDataListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpDataOrBuilder>)this.helpDataList_);
            }
            
            public FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData.Builder addHelpDataListBuilder() {
                return this.getHelpDataListFieldBuilder().addBuilder(FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData.getDefaultInstance());
            }
            
            public FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData.Builder addHelpDataListBuilder(final int index) {
                return this.getHelpDataListFieldBuilder().addBuilder(index, FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData.getDefaultInstance());
            }
            
            public List<FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData.Builder> getHelpDataListBuilderList() {
                return this.getHelpDataListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData, FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData.Builder, FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpDataOrBuilder> getHelpDataListFieldBuilder() {
                if (this.helpDataListBuilder_ == null) {
                    this.helpDataListBuilder_ = new RepeatedFieldBuilderV3<FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData, FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData.Builder, FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpDataOrBuilder>(this.helpDataList_, (this.bitField0_ & 0x4) != 0x0, this.getParentForChildren(), this.isClean());
                    this.helpDataList_ = null;
                }
                return this.helpDataListBuilder_;
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
    
    public interface FurnitureMakeRspOrBuilder extends MessageOrBuilder
    {
        List<FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData> getHelpedDataListList();
        
        FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedData getHelpedDataList(final int p0);
        
        int getHelpedDataListCount();
        
        List<? extends FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedDataOrBuilder> getHelpedDataListOrBuilderList();
        
        FurnitureMakeBeHelpedDataOuterClass.FurnitureMakeBeHelpedDataOrBuilder getHelpedDataListOrBuilder(final int p0);
        
        List<FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo> getMakeInfoListList();
        
        FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo getMakeInfoList(final int p0);
        
        int getMakeInfoListCount();
        
        List<? extends FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfoOrBuilder> getMakeInfoListOrBuilderList();
        
        FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfoOrBuilder getMakeInfoListOrBuilder(final int p0);
        
        boolean hasFurnitureMakeSlot();
        
        FurnitureMakeSlotOuterClass.FurnitureMakeSlot getFurnitureMakeSlot();
        
        FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder getFurnitureMakeSlotOrBuilder();
        
        int getRetcode();
        
        List<FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData> getHelpDataListList();
        
        FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData getHelpDataList(final int p0);
        
        int getHelpDataListCount();
        
        List<? extends FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpDataOrBuilder> getHelpDataListOrBuilderList();
        
        FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpDataOrBuilder getHelpDataListOrBuilder(final int p0);
    }
}
