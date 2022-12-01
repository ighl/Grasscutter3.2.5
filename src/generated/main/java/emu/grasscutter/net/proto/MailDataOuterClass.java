// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Message;
import java.io.InputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Internal;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ByteString;
import com.google.protobuf.ProtocolStringList;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.LazyStringArrayList;
import java.util.Collections;
import com.google.protobuf.Parser;
import com.google.protobuf.LazyStringList;
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class MailDataOuterClass
{
    private static final Descriptors.Descriptor internal_static_MailData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MailData_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private MailDataOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MailDataOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u000eMailData.proto\u001a\u000eMailItem.proto\u001a\u0015MailTextContent.proto\u001a\u0019Unk2700_CBJEDMGOBPL.proto\"«\u0002\n\bMailData\u0012\u000f\n\u0007mail_id\u0018\u0001 \u0001(\r\u0012+\n\u0011mail_text_content\u0018\u0004 \u0001(\u000b2\u0010.MailTextContent\u0012\u001c\n\titem_list\u0018\u0007 \u0003(\u000b2\t.MailItem\u0012\u0011\n\tsend_time\u0018\b \u0001(\r\u0012\u0013\n\u000bexpire_time\u0018\t \u0001(\r\u0012\u0012\n\nimportance\u0018\n \u0001(\r\u0012\u000f\n\u0007is_read\u0018\u000b \u0001(\b\u0012\u0019\n\u0011is_attachment_got\u0018\f \u0001(\b\u0012\u0011\n\tconfig_id\u0018\r \u0001(\r\u0012\u0015\n\rargument_list\u0018\u000e \u0003(\t\u00121\n\u0013Unk2700_NDPPGJKJOMH\u0018\u000f \u0001(\u000e2\u0014.Unk2700_CBJEDMGOBPLB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MailDataOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { MailItemOuterClass.getDescriptor(), MailTextContentOuterClass.getDescriptor(), Unk2700CBJEDMGOBPL.getDescriptor() });
        internal_static_MailData_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MailData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MailDataOuterClass.internal_static_MailData_descriptor, new String[] { "MailId", "MailTextContent", "ItemList", "SendTime", "ExpireTime", "Importance", "IsRead", "IsAttachmentGot", "ConfigId", "ArgumentList", "Unk2700NDPPGJKJOMH" });
        MailItemOuterClass.getDescriptor();
        MailTextContentOuterClass.getDescriptor();
        Unk2700CBJEDMGOBPL.getDescriptor();
    }
    
    public static final class MailData extends GeneratedMessageV3 implements MailDataOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int MAIL_ID_FIELD_NUMBER = 1;
        private int mailId_;
        public static final int MAIL_TEXT_CONTENT_FIELD_NUMBER = 4;
        private MailTextContentOuterClass.MailTextContent mailTextContent_;
        public static final int ITEM_LIST_FIELD_NUMBER = 7;
        private List<MailItemOuterClass.MailItem> itemList_;
        public static final int SEND_TIME_FIELD_NUMBER = 8;
        private int sendTime_;
        public static final int EXPIRE_TIME_FIELD_NUMBER = 9;
        private int expireTime_;
        public static final int IMPORTANCE_FIELD_NUMBER = 10;
        private int importance_;
        public static final int IS_READ_FIELD_NUMBER = 11;
        private boolean isRead_;
        public static final int IS_ATTACHMENT_GOT_FIELD_NUMBER = 12;
        private boolean isAttachmentGot_;
        public static final int CONFIG_ID_FIELD_NUMBER = 13;
        private int configId_;
        public static final int ARGUMENT_LIST_FIELD_NUMBER = 14;
        private LazyStringList argumentList_;
        public static final int UNK2700_NDPPGJKJOMH_FIELD_NUMBER = 15;
        private int unk2700NDPPGJKJOMH_;
        private byte memoizedIsInitialized;
        private static final MailData DEFAULT_INSTANCE;
        private static final Parser<MailData> PARSER;
        
        private MailData(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private MailData() {
            this.memoizedIsInitialized = -1;
            this.itemList_ = Collections.emptyList();
            this.argumentList_ = LazyStringArrayList.EMPTY;
            this.unk2700NDPPGJKJOMH_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new MailData();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private MailData(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.mailId_ = input.readUInt32();
                            continue;
                        }
                        case 34: {
                            MailTextContentOuterClass.MailTextContent.Builder subBuilder = null;
                            if (this.mailTextContent_ != null) {
                                subBuilder = this.mailTextContent_.toBuilder();
                            }
                            this.mailTextContent_ = input.readMessage(MailTextContentOuterClass.MailTextContent.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.mailTextContent_);
                                this.mailTextContent_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 58: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.itemList_ = new ArrayList<MailItemOuterClass.MailItem>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.itemList_.add(input.readMessage(MailItemOuterClass.MailItem.parser(), extensionRegistry));
                            continue;
                        }
                        case 64: {
                            this.sendTime_ = input.readUInt32();
                            continue;
                        }
                        case 72: {
                            this.expireTime_ = input.readUInt32();
                            continue;
                        }
                        case 80: {
                            this.importance_ = input.readUInt32();
                            continue;
                        }
                        case 88: {
                            this.isRead_ = input.readBool();
                            continue;
                        }
                        case 96: {
                            this.isAttachmentGot_ = input.readBool();
                            continue;
                        }
                        case 104: {
                            this.configId_ = input.readUInt32();
                            continue;
                        }
                        case 114: {
                            final String s = input.readStringRequireUtf8();
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.argumentList_ = new LazyStringArrayList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.argumentList_.add(s);
                            continue;
                        }
                        case 120: {
                            final int rawValue = input.readEnum();
                            this.unk2700NDPPGJKJOMH_ = rawValue;
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
                    this.itemList_ = Collections.unmodifiableList((List<? extends MailItemOuterClass.MailItem>)this.itemList_);
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.argumentList_ = this.argumentList_.getUnmodifiableView();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return MailDataOuterClass.internal_static_MailData_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MailDataOuterClass.internal_static_MailData_fieldAccessorTable.ensureFieldAccessorsInitialized(MailData.class, Builder.class);
        }
        
        @Override
        public int getMailId() {
            return this.mailId_;
        }
        
        @Override
        public boolean hasMailTextContent() {
            return this.mailTextContent_ != null;
        }
        
        @Override
        public MailTextContentOuterClass.MailTextContent getMailTextContent() {
            return (this.mailTextContent_ == null) ? MailTextContentOuterClass.MailTextContent.getDefaultInstance() : this.mailTextContent_;
        }
        
        @Override
        public MailTextContentOuterClass.MailTextContentOrBuilder getMailTextContentOrBuilder() {
            return this.getMailTextContent();
        }
        
        @Override
        public List<MailItemOuterClass.MailItem> getItemListList() {
            return this.itemList_;
        }
        
        @Override
        public List<? extends MailItemOuterClass.MailItemOrBuilder> getItemListOrBuilderList() {
            return this.itemList_;
        }
        
        @Override
        public int getItemListCount() {
            return this.itemList_.size();
        }
        
        @Override
        public MailItemOuterClass.MailItem getItemList(final int index) {
            return this.itemList_.get(index);
        }
        
        @Override
        public MailItemOuterClass.MailItemOrBuilder getItemListOrBuilder(final int index) {
            return this.itemList_.get(index);
        }
        
        @Override
        public int getSendTime() {
            return this.sendTime_;
        }
        
        @Override
        public int getExpireTime() {
            return this.expireTime_;
        }
        
        @Override
        public int getImportance() {
            return this.importance_;
        }
        
        @Override
        public boolean getIsRead() {
            return this.isRead_;
        }
        
        @Override
        public boolean getIsAttachmentGot() {
            return this.isAttachmentGot_;
        }
        
        @Override
        public int getConfigId() {
            return this.configId_;
        }
        
        @Override
        public ProtocolStringList getArgumentListList() {
            return this.argumentList_;
        }
        
        @Override
        public int getArgumentListCount() {
            return this.argumentList_.size();
        }
        
        @Override
        public String getArgumentList(final int index) {
            return this.argumentList_.get(index);
        }
        
        @Override
        public ByteString getArgumentListBytes(final int index) {
            return this.argumentList_.getByteString(index);
        }
        
        @Override
        public int getUnk2700NDPPGJKJOMHValue() {
            return this.unk2700NDPPGJKJOMH_;
        }
        
        @Override
        public Unk2700CBJEDMGOBPL.Unk2700_CBJEDMGOBPL getUnk2700NDPPGJKJOMH() {
            final Unk2700CBJEDMGOBPL.Unk2700_CBJEDMGOBPL result = Unk2700CBJEDMGOBPL.Unk2700_CBJEDMGOBPL.valueOf(this.unk2700NDPPGJKJOMH_);
            return (result == null) ? Unk2700CBJEDMGOBPL.Unk2700_CBJEDMGOBPL.UNRECOGNIZED : result;
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
            if (this.mailId_ != 0) {
                output.writeUInt32(1, this.mailId_);
            }
            if (this.mailTextContent_ != null) {
                output.writeMessage(4, this.getMailTextContent());
            }
            for (int i = 0; i < this.itemList_.size(); ++i) {
                output.writeMessage(7, this.itemList_.get(i));
            }
            if (this.sendTime_ != 0) {
                output.writeUInt32(8, this.sendTime_);
            }
            if (this.expireTime_ != 0) {
                output.writeUInt32(9, this.expireTime_);
            }
            if (this.importance_ != 0) {
                output.writeUInt32(10, this.importance_);
            }
            if (this.isRead_) {
                output.writeBool(11, this.isRead_);
            }
            if (this.isAttachmentGot_) {
                output.writeBool(12, this.isAttachmentGot_);
            }
            if (this.configId_ != 0) {
                output.writeUInt32(13, this.configId_);
            }
            for (int i = 0; i < this.argumentList_.size(); ++i) {
                GeneratedMessageV3.writeString(output, 14, this.argumentList_.getRaw(i));
            }
            if (this.unk2700NDPPGJKJOMH_ != Unk2700CBJEDMGOBPL.Unk2700_CBJEDMGOBPL.Unk2700_CBJEDMGOBPL_Unk2700_MBLDLJOKLBL.getNumber()) {
                output.writeEnum(15, this.unk2700NDPPGJKJOMH_);
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
            if (this.mailId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.mailId_);
            }
            if (this.mailTextContent_ != null) {
                size += CodedOutputStream.computeMessageSize(4, this.getMailTextContent());
            }
            for (int i = 0; i < this.itemList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(7, this.itemList_.get(i));
            }
            if (this.sendTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.sendTime_);
            }
            if (this.expireTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.expireTime_);
            }
            if (this.importance_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.importance_);
            }
            if (this.isRead_) {
                size += CodedOutputStream.computeBoolSize(11, this.isRead_);
            }
            if (this.isAttachmentGot_) {
                size += CodedOutputStream.computeBoolSize(12, this.isAttachmentGot_);
            }
            if (this.configId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.configId_);
            }
            int dataSize = 0;
            for (int j = 0; j < this.argumentList_.size(); ++j) {
                dataSize += GeneratedMessageV3.computeStringSizeNoTag(this.argumentList_.getRaw(j));
            }
            size += dataSize;
            size += 1 * this.getArgumentListList().size();
            if (this.unk2700NDPPGJKJOMH_ != Unk2700CBJEDMGOBPL.Unk2700_CBJEDMGOBPL.Unk2700_CBJEDMGOBPL_Unk2700_MBLDLJOKLBL.getNumber()) {
                size += CodedOutputStream.computeEnumSize(15, this.unk2700NDPPGJKJOMH_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MailData)) {
                return super.equals(obj);
            }
            final MailData other = (MailData)obj;
            return this.getMailId() == other.getMailId() && this.hasMailTextContent() == other.hasMailTextContent() && (!this.hasMailTextContent() || this.getMailTextContent().equals(other.getMailTextContent())) && this.getItemListList().equals(other.getItemListList()) && this.getSendTime() == other.getSendTime() && this.getExpireTime() == other.getExpireTime() && this.getImportance() == other.getImportance() && this.getIsRead() == other.getIsRead() && this.getIsAttachmentGot() == other.getIsAttachmentGot() && this.getConfigId() == other.getConfigId() && this.getArgumentListList().equals(other.getArgumentListList()) && this.unk2700NDPPGJKJOMH_ == other.unk2700NDPPGJKJOMH_ && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getMailId();
            if (this.hasMailTextContent()) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.getMailTextContent().hashCode();
            }
            if (this.getItemListCount() > 0) {
                hash = 37 * hash + 7;
                hash = 53 * hash + this.getItemListList().hashCode();
            }
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getSendTime();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getExpireTime();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getImportance();
            hash = 37 * hash + 11;
            hash = 53 * hash + Internal.hashBoolean(this.getIsRead());
            hash = 37 * hash + 12;
            hash = 53 * hash + Internal.hashBoolean(this.getIsAttachmentGot());
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getConfigId();
            if (this.getArgumentListCount() > 0) {
                hash = 37 * hash + 14;
                hash = 53 * hash + this.getArgumentListList().hashCode();
            }
            hash = 37 * hash + 15;
            hash = 53 * hash + this.unk2700NDPPGJKJOMH_;
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static MailData parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return MailData.PARSER.parseFrom(data);
        }
        
        public static MailData parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MailData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MailData parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return MailData.PARSER.parseFrom(data);
        }
        
        public static MailData parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MailData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MailData parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return MailData.PARSER.parseFrom(data);
        }
        
        public static MailData parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MailData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MailData parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MailData.PARSER, input);
        }
        
        public static MailData parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MailData.PARSER, input, extensionRegistry);
        }
        
        public static MailData parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MailData.PARSER, input);
        }
        
        public static MailData parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MailData.PARSER, input, extensionRegistry);
        }
        
        public static MailData parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MailData.PARSER, input);
        }
        
        public static MailData parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MailData.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return MailData.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final MailData prototype) {
            return MailData.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == MailData.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static MailData getDefaultInstance() {
            return MailData.DEFAULT_INSTANCE;
        }
        
        public static Parser<MailData> parser() {
            return MailData.PARSER;
        }
        
        @Override
        public Parser<MailData> getParserForType() {
            return MailData.PARSER;
        }
        
        @Override
        public MailData getDefaultInstanceForType() {
            return MailData.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new MailData();
            PARSER = new AbstractParser<MailData>() {
                @Override
                public MailData parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new MailData(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MailDataOrBuilder
        {
            private int bitField0_;
            private int mailId_;
            private MailTextContentOuterClass.MailTextContent mailTextContent_;
            private SingleFieldBuilderV3<MailTextContentOuterClass.MailTextContent, MailTextContentOuterClass.MailTextContent.Builder, MailTextContentOuterClass.MailTextContentOrBuilder> mailTextContentBuilder_;
            private List<MailItemOuterClass.MailItem> itemList_;
            private RepeatedFieldBuilderV3<MailItemOuterClass.MailItem, MailItemOuterClass.MailItem.Builder, MailItemOuterClass.MailItemOrBuilder> itemListBuilder_;
            private int sendTime_;
            private int expireTime_;
            private int importance_;
            private boolean isRead_;
            private boolean isAttachmentGot_;
            private int configId_;
            private LazyStringList argumentList_;
            private int unk2700NDPPGJKJOMH_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return MailDataOuterClass.internal_static_MailData_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MailDataOuterClass.internal_static_MailData_fieldAccessorTable.ensureFieldAccessorsInitialized(MailData.class, Builder.class);
            }
            
            private Builder() {
                this.itemList_ = Collections.emptyList();
                this.argumentList_ = LazyStringArrayList.EMPTY;
                this.unk2700NDPPGJKJOMH_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.itemList_ = Collections.emptyList();
                this.argumentList_ = LazyStringArrayList.EMPTY;
                this.unk2700NDPPGJKJOMH_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (MailData.alwaysUseFieldBuilders) {
                    this.getItemListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.mailId_ = 0;
                if (this.mailTextContentBuilder_ == null) {
                    this.mailTextContent_ = null;
                }
                else {
                    this.mailTextContent_ = null;
                    this.mailTextContentBuilder_ = null;
                }
                if (this.itemListBuilder_ == null) {
                    this.itemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.itemListBuilder_.clear();
                }
                this.sendTime_ = 0;
                this.expireTime_ = 0;
                this.importance_ = 0;
                this.isRead_ = false;
                this.isAttachmentGot_ = false;
                this.configId_ = 0;
                this.argumentList_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= 0xFFFFFFFD;
                this.unk2700NDPPGJKJOMH_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return MailDataOuterClass.internal_static_MailData_descriptor;
            }
            
            @Override
            public MailData getDefaultInstanceForType() {
                return MailData.getDefaultInstance();
            }
            
            @Override
            public MailData build() {
                final MailData result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public MailData buildPartial() {
                final MailData result = new MailData(this);
                final int from_bitField0_ = this.bitField0_;
                result.mailId_ = this.mailId_;
                if (this.mailTextContentBuilder_ == null) {
                    result.mailTextContent_ = this.mailTextContent_;
                }
                else {
                    result.mailTextContent_ = this.mailTextContentBuilder_.build();
                }
                if (this.itemListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.itemList_ = Collections.unmodifiableList((List<? extends MailItemOuterClass.MailItem>)this.itemList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.itemList_ = this.itemList_;
                }
                else {
                    result.itemList_ = this.itemListBuilder_.build();
                }
                result.sendTime_ = this.sendTime_;
                result.expireTime_ = this.expireTime_;
                result.importance_ = this.importance_;
                result.isRead_ = this.isRead_;
                result.isAttachmentGot_ = this.isAttachmentGot_;
                result.configId_ = this.configId_;
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.argumentList_ = this.argumentList_.getUnmodifiableView();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.argumentList_ = this.argumentList_;
                result.unk2700NDPPGJKJOMH_ = this.unk2700NDPPGJKJOMH_;
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
                if (other instanceof MailData) {
                    return this.mergeFrom((MailData)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final MailData other) {
                if (other == MailData.getDefaultInstance()) {
                    return this;
                }
                if (other.getMailId() != 0) {
                    this.setMailId(other.getMailId());
                }
                if (other.hasMailTextContent()) {
                    this.mergeMailTextContent(other.getMailTextContent());
                }
                if (this.itemListBuilder_ == null) {
                    if (!other.itemList_.isEmpty()) {
                        if (this.itemList_.isEmpty()) {
                            this.itemList_ = other.itemList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureItemListIsMutable();
                            this.itemList_.addAll(other.itemList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.itemList_.isEmpty()) {
                    if (this.itemListBuilder_.isEmpty()) {
                        this.itemListBuilder_.dispose();
                        this.itemListBuilder_ = null;
                        this.itemList_ = other.itemList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.itemListBuilder_ = (MailData.alwaysUseFieldBuilders ? this.getItemListFieldBuilder() : null);
                    }
                    else {
                        this.itemListBuilder_.addAllMessages(other.itemList_);
                    }
                }
                if (other.getSendTime() != 0) {
                    this.setSendTime(other.getSendTime());
                }
                if (other.getExpireTime() != 0) {
                    this.setExpireTime(other.getExpireTime());
                }
                if (other.getImportance() != 0) {
                    this.setImportance(other.getImportance());
                }
                if (other.getIsRead()) {
                    this.setIsRead(other.getIsRead());
                }
                if (other.getIsAttachmentGot()) {
                    this.setIsAttachmentGot(other.getIsAttachmentGot());
                }
                if (other.getConfigId() != 0) {
                    this.setConfigId(other.getConfigId());
                }
                if (!other.argumentList_.isEmpty()) {
                    if (this.argumentList_.isEmpty()) {
                        this.argumentList_ = other.argumentList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensureArgumentListIsMutable();
                        this.argumentList_.addAll(other.argumentList_);
                    }
                    this.onChanged();
                }
                if (other.unk2700NDPPGJKJOMH_ != 0) {
                    this.setUnk2700NDPPGJKJOMHValue(other.getUnk2700NDPPGJKJOMHValue());
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
                MailData parsedMessage = null;
                try {
                    parsedMessage = MailData.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (MailData)e.getUnfinishedMessage();
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
            public int getMailId() {
                return this.mailId_;
            }
            
            public Builder setMailId(final int value) {
                this.mailId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMailId() {
                this.mailId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasMailTextContent() {
                return this.mailTextContentBuilder_ != null || this.mailTextContent_ != null;
            }
            
            @Override
            public MailTextContentOuterClass.MailTextContent getMailTextContent() {
                if (this.mailTextContentBuilder_ == null) {
                    return (this.mailTextContent_ == null) ? MailTextContentOuterClass.MailTextContent.getDefaultInstance() : this.mailTextContent_;
                }
                return this.mailTextContentBuilder_.getMessage();
            }
            
            public Builder setMailTextContent(final MailTextContentOuterClass.MailTextContent value) {
                if (this.mailTextContentBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.mailTextContent_ = value;
                    this.onChanged();
                }
                else {
                    this.mailTextContentBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setMailTextContent(final MailTextContentOuterClass.MailTextContent.Builder builderForValue) {
                if (this.mailTextContentBuilder_ == null) {
                    this.mailTextContent_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.mailTextContentBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeMailTextContent(final MailTextContentOuterClass.MailTextContent value) {
                if (this.mailTextContentBuilder_ == null) {
                    if (this.mailTextContent_ != null) {
                        this.mailTextContent_ = MailTextContentOuterClass.MailTextContent.newBuilder(this.mailTextContent_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.mailTextContent_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.mailTextContentBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearMailTextContent() {
                if (this.mailTextContentBuilder_ == null) {
                    this.mailTextContent_ = null;
                    this.onChanged();
                }
                else {
                    this.mailTextContent_ = null;
                    this.mailTextContentBuilder_ = null;
                }
                return this;
            }
            
            public MailTextContentOuterClass.MailTextContent.Builder getMailTextContentBuilder() {
                this.onChanged();
                return this.getMailTextContentFieldBuilder().getBuilder();
            }
            
            @Override
            public MailTextContentOuterClass.MailTextContentOrBuilder getMailTextContentOrBuilder() {
                if (this.mailTextContentBuilder_ != null) {
                    return this.mailTextContentBuilder_.getMessageOrBuilder();
                }
                return (this.mailTextContent_ == null) ? MailTextContentOuterClass.MailTextContent.getDefaultInstance() : this.mailTextContent_;
            }
            
            private SingleFieldBuilderV3<MailTextContentOuterClass.MailTextContent, MailTextContentOuterClass.MailTextContent.Builder, MailTextContentOuterClass.MailTextContentOrBuilder> getMailTextContentFieldBuilder() {
                if (this.mailTextContentBuilder_ == null) {
                    this.mailTextContentBuilder_ = new SingleFieldBuilderV3<MailTextContentOuterClass.MailTextContent, MailTextContentOuterClass.MailTextContent.Builder, MailTextContentOuterClass.MailTextContentOrBuilder>(this.getMailTextContent(), this.getParentForChildren(), this.isClean());
                    this.mailTextContent_ = null;
                }
                return this.mailTextContentBuilder_;
            }
            
            private void ensureItemListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.itemList_ = new ArrayList<MailItemOuterClass.MailItem>(this.itemList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<MailItemOuterClass.MailItem> getItemListList() {
                if (this.itemListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends MailItemOuterClass.MailItem>)this.itemList_);
                }
                return this.itemListBuilder_.getMessageList();
            }
            
            @Override
            public int getItemListCount() {
                if (this.itemListBuilder_ == null) {
                    return this.itemList_.size();
                }
                return this.itemListBuilder_.getCount();
            }
            
            @Override
            public MailItemOuterClass.MailItem getItemList(final int index) {
                if (this.itemListBuilder_ == null) {
                    return this.itemList_.get(index);
                }
                return this.itemListBuilder_.getMessage(index);
            }
            
            public Builder setItemList(final int index, final MailItemOuterClass.MailItem value) {
                if (this.itemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureItemListIsMutable();
                    this.itemList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.itemListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setItemList(final int index, final MailItemOuterClass.MailItem.Builder builderForValue) {
                if (this.itemListBuilder_ == null) {
                    this.ensureItemListIsMutable();
                    this.itemList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.itemListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addItemList(final MailItemOuterClass.MailItem value) {
                if (this.itemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureItemListIsMutable();
                    this.itemList_.add(value);
                    this.onChanged();
                }
                else {
                    this.itemListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addItemList(final int index, final MailItemOuterClass.MailItem value) {
                if (this.itemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureItemListIsMutable();
                    this.itemList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.itemListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addItemList(final MailItemOuterClass.MailItem.Builder builderForValue) {
                if (this.itemListBuilder_ == null) {
                    this.ensureItemListIsMutable();
                    this.itemList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.itemListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addItemList(final int index, final MailItemOuterClass.MailItem.Builder builderForValue) {
                if (this.itemListBuilder_ == null) {
                    this.ensureItemListIsMutable();
                    this.itemList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.itemListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllItemList(final Iterable<? extends MailItemOuterClass.MailItem> values) {
                if (this.itemListBuilder_ == null) {
                    this.ensureItemListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.itemList_);
                    this.onChanged();
                }
                else {
                    this.itemListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearItemList() {
                if (this.itemListBuilder_ == null) {
                    this.itemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.itemListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeItemList(final int index) {
                if (this.itemListBuilder_ == null) {
                    this.ensureItemListIsMutable();
                    this.itemList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.itemListBuilder_.remove(index);
                }
                return this;
            }
            
            public MailItemOuterClass.MailItem.Builder getItemListBuilder(final int index) {
                return this.getItemListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public MailItemOuterClass.MailItemOrBuilder getItemListOrBuilder(final int index) {
                if (this.itemListBuilder_ == null) {
                    return this.itemList_.get(index);
                }
                return this.itemListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends MailItemOuterClass.MailItemOrBuilder> getItemListOrBuilderList() {
                if (this.itemListBuilder_ != null) {
                    return this.itemListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends MailItemOuterClass.MailItemOrBuilder>)this.itemList_);
            }
            
            public MailItemOuterClass.MailItem.Builder addItemListBuilder() {
                return this.getItemListFieldBuilder().addBuilder(MailItemOuterClass.MailItem.getDefaultInstance());
            }
            
            public MailItemOuterClass.MailItem.Builder addItemListBuilder(final int index) {
                return this.getItemListFieldBuilder().addBuilder(index, MailItemOuterClass.MailItem.getDefaultInstance());
            }
            
            public List<MailItemOuterClass.MailItem.Builder> getItemListBuilderList() {
                return this.getItemListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<MailItemOuterClass.MailItem, MailItemOuterClass.MailItem.Builder, MailItemOuterClass.MailItemOrBuilder> getItemListFieldBuilder() {
                if (this.itemListBuilder_ == null) {
                    this.itemListBuilder_ = new RepeatedFieldBuilderV3<MailItemOuterClass.MailItem, MailItemOuterClass.MailItem.Builder, MailItemOuterClass.MailItemOrBuilder>(this.itemList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.itemList_ = null;
                }
                return this.itemListBuilder_;
            }
            
            @Override
            public int getSendTime() {
                return this.sendTime_;
            }
            
            public Builder setSendTime(final int value) {
                this.sendTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSendTime() {
                this.sendTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getExpireTime() {
                return this.expireTime_;
            }
            
            public Builder setExpireTime(final int value) {
                this.expireTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearExpireTime() {
                this.expireTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getImportance() {
                return this.importance_;
            }
            
            public Builder setImportance(final int value) {
                this.importance_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearImportance() {
                this.importance_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsRead() {
                return this.isRead_;
            }
            
            public Builder setIsRead(final boolean value) {
                this.isRead_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsRead() {
                this.isRead_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsAttachmentGot() {
                return this.isAttachmentGot_;
            }
            
            public Builder setIsAttachmentGot(final boolean value) {
                this.isAttachmentGot_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsAttachmentGot() {
                this.isAttachmentGot_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getConfigId() {
                return this.configId_;
            }
            
            public Builder setConfigId(final int value) {
                this.configId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearConfigId() {
                this.configId_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureArgumentListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.argumentList_ = new LazyStringArrayList(this.argumentList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public ProtocolStringList getArgumentListList() {
                return this.argumentList_.getUnmodifiableView();
            }
            
            @Override
            public int getArgumentListCount() {
                return this.argumentList_.size();
            }
            
            @Override
            public String getArgumentList(final int index) {
                return this.argumentList_.get(index);
            }
            
            @Override
            public ByteString getArgumentListBytes(final int index) {
                return this.argumentList_.getByteString(index);
            }
            
            public Builder setArgumentList(final int index, final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureArgumentListIsMutable();
                this.argumentList_.set(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addArgumentList(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureArgumentListIsMutable();
                this.argumentList_.add(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllArgumentList(final Iterable<String> values) {
                this.ensureArgumentListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.argumentList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearArgumentList() {
                this.argumentList_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= 0xFFFFFFFD;
                this.onChanged();
                return this;
            }
            
            public Builder addArgumentListBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.ensureArgumentListIsMutable();
                this.argumentList_.add(value);
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUnk2700NDPPGJKJOMHValue() {
                return this.unk2700NDPPGJKJOMH_;
            }
            
            public Builder setUnk2700NDPPGJKJOMHValue(final int value) {
                this.unk2700NDPPGJKJOMH_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public Unk2700CBJEDMGOBPL.Unk2700_CBJEDMGOBPL getUnk2700NDPPGJKJOMH() {
                final Unk2700CBJEDMGOBPL.Unk2700_CBJEDMGOBPL result = Unk2700CBJEDMGOBPL.Unk2700_CBJEDMGOBPL.valueOf(this.unk2700NDPPGJKJOMH_);
                return (result == null) ? Unk2700CBJEDMGOBPL.Unk2700_CBJEDMGOBPL.UNRECOGNIZED : result;
            }
            
            public Builder setUnk2700NDPPGJKJOMH(final Unk2700CBJEDMGOBPL.Unk2700_CBJEDMGOBPL value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.unk2700NDPPGJKJOMH_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700NDPPGJKJOMH() {
                this.unk2700NDPPGJKJOMH_ = 0;
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
    
    public interface MailDataOrBuilder extends MessageOrBuilder
    {
        int getMailId();
        
        boolean hasMailTextContent();
        
        MailTextContentOuterClass.MailTextContent getMailTextContent();
        
        MailTextContentOuterClass.MailTextContentOrBuilder getMailTextContentOrBuilder();
        
        List<MailItemOuterClass.MailItem> getItemListList();
        
        MailItemOuterClass.MailItem getItemList(final int p0);
        
        int getItemListCount();
        
        List<? extends MailItemOuterClass.MailItemOrBuilder> getItemListOrBuilderList();
        
        MailItemOuterClass.MailItemOrBuilder getItemListOrBuilder(final int p0);
        
        int getSendTime();
        
        int getExpireTime();
        
        int getImportance();
        
        boolean getIsRead();
        
        boolean getIsAttachmentGot();
        
        int getConfigId();
        
        List<String> getArgumentListList();
        
        int getArgumentListCount();
        
        String getArgumentList(final int p0);
        
        ByteString getArgumentListBytes(final int p0);
        
        int getUnk2700NDPPGJKJOMHValue();
        
        Unk2700CBJEDMGOBPL.Unk2700_CBJEDMGOBPL getUnk2700NDPPGJKJOMH();
    }
}
