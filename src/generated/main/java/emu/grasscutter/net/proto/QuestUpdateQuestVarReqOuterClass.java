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
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class QuestUpdateQuestVarReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_QuestUpdateQuestVarReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_QuestUpdateQuestVarReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private QuestUpdateQuestVarReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return QuestUpdateQuestVarReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001cQuestUpdateQuestVarReq.proto\u001a\u0010QuestVarOp.proto\"\u0089\u0001\n\u0016QuestUpdateQuestVarReq\u0012\u0017\n\u000fparent_quest_id\u0018\t \u0001(\r\u0012&\n\u0011quest_var_op_list\u0018\u0004 \u0003(\u000b2\u000b.QuestVarOp\u0012\u0010\n\bquest_id\u0018\u000b \u0001(\r\u0012\u001c\n\u0014parent_quest_var_seq\u0018\u0001 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        QuestUpdateQuestVarReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { QuestVarOpOuterClass.getDescriptor() });
        internal_static_QuestUpdateQuestVarReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_QuestUpdateQuestVarReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(QuestUpdateQuestVarReqOuterClass.internal_static_QuestUpdateQuestVarReq_descriptor, new String[] { "ParentQuestId", "QuestVarOpList", "QuestId", "ParentQuestVarSeq" });
        QuestVarOpOuterClass.getDescriptor();
    }
    
    public static final class QuestUpdateQuestVarReq extends GeneratedMessageV3 implements QuestUpdateQuestVarReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int PARENT_QUEST_ID_FIELD_NUMBER = 9;
        private int parentQuestId_;
        public static final int QUEST_VAR_OP_LIST_FIELD_NUMBER = 4;
        private List<QuestVarOpOuterClass.QuestVarOp> questVarOpList_;
        public static final int QUEST_ID_FIELD_NUMBER = 11;
        private int questId_;
        public static final int PARENT_QUEST_VAR_SEQ_FIELD_NUMBER = 1;
        private int parentQuestVarSeq_;
        private byte memoizedIsInitialized;
        private static final QuestUpdateQuestVarReq DEFAULT_INSTANCE;
        private static final Parser<QuestUpdateQuestVarReq> PARSER;
        
        private QuestUpdateQuestVarReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private QuestUpdateQuestVarReq() {
            this.memoizedIsInitialized = -1;
            this.questVarOpList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new QuestUpdateQuestVarReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private QuestUpdateQuestVarReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.parentQuestVarSeq_ = input.readUInt32();
                            continue;
                        }
                        case 34: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.questVarOpList_ = new ArrayList<QuestVarOpOuterClass.QuestVarOp>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.questVarOpList_.add(input.readMessage(QuestVarOpOuterClass.QuestVarOp.parser(), extensionRegistry));
                            continue;
                        }
                        case 72: {
                            this.parentQuestId_ = input.readUInt32();
                            continue;
                        }
                        case 88: {
                            this.questId_ = input.readUInt32();
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
                    this.questVarOpList_ = Collections.unmodifiableList((List<? extends QuestVarOpOuterClass.QuestVarOp>)this.questVarOpList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return QuestUpdateQuestVarReqOuterClass.internal_static_QuestUpdateQuestVarReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return QuestUpdateQuestVarReqOuterClass.internal_static_QuestUpdateQuestVarReq_fieldAccessorTable.ensureFieldAccessorsInitialized(QuestUpdateQuestVarReq.class, Builder.class);
        }
        
        @Override
        public int getParentQuestId() {
            return this.parentQuestId_;
        }
        
        @Override
        public List<QuestVarOpOuterClass.QuestVarOp> getQuestVarOpListList() {
            return this.questVarOpList_;
        }
        
        @Override
        public List<? extends QuestVarOpOuterClass.QuestVarOpOrBuilder> getQuestVarOpListOrBuilderList() {
            return this.questVarOpList_;
        }
        
        @Override
        public int getQuestVarOpListCount() {
            return this.questVarOpList_.size();
        }
        
        @Override
        public QuestVarOpOuterClass.QuestVarOp getQuestVarOpList(final int index) {
            return this.questVarOpList_.get(index);
        }
        
        @Override
        public QuestVarOpOuterClass.QuestVarOpOrBuilder getQuestVarOpListOrBuilder(final int index) {
            return this.questVarOpList_.get(index);
        }
        
        @Override
        public int getQuestId() {
            return this.questId_;
        }
        
        @Override
        public int getParentQuestVarSeq() {
            return this.parentQuestVarSeq_;
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
            if (this.parentQuestVarSeq_ != 0) {
                output.writeUInt32(1, this.parentQuestVarSeq_);
            }
            for (int i = 0; i < this.questVarOpList_.size(); ++i) {
                output.writeMessage(4, this.questVarOpList_.get(i));
            }
            if (this.parentQuestId_ != 0) {
                output.writeUInt32(9, this.parentQuestId_);
            }
            if (this.questId_ != 0) {
                output.writeUInt32(11, this.questId_);
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
            if (this.parentQuestVarSeq_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.parentQuestVarSeq_);
            }
            for (int i = 0; i < this.questVarOpList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(4, this.questVarOpList_.get(i));
            }
            if (this.parentQuestId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.parentQuestId_);
            }
            if (this.questId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.questId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof QuestUpdateQuestVarReq)) {
                return super.equals(obj);
            }
            final QuestUpdateQuestVarReq other = (QuestUpdateQuestVarReq)obj;
            return this.getParentQuestId() == other.getParentQuestId() && this.getQuestVarOpListList().equals(other.getQuestVarOpListList()) && this.getQuestId() == other.getQuestId() && this.getParentQuestVarSeq() == other.getParentQuestVarSeq() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getParentQuestId();
            if (this.getQuestVarOpListCount() > 0) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.getQuestVarOpListList().hashCode();
            }
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getQuestId();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getParentQuestVarSeq();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static QuestUpdateQuestVarReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return QuestUpdateQuestVarReq.PARSER.parseFrom(data);
        }
        
        public static QuestUpdateQuestVarReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return QuestUpdateQuestVarReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static QuestUpdateQuestVarReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return QuestUpdateQuestVarReq.PARSER.parseFrom(data);
        }
        
        public static QuestUpdateQuestVarReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return QuestUpdateQuestVarReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static QuestUpdateQuestVarReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return QuestUpdateQuestVarReq.PARSER.parseFrom(data);
        }
        
        public static QuestUpdateQuestVarReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return QuestUpdateQuestVarReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static QuestUpdateQuestVarReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QuestUpdateQuestVarReq.PARSER, input);
        }
        
        public static QuestUpdateQuestVarReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QuestUpdateQuestVarReq.PARSER, input, extensionRegistry);
        }
        
        public static QuestUpdateQuestVarReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(QuestUpdateQuestVarReq.PARSER, input);
        }
        
        public static QuestUpdateQuestVarReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(QuestUpdateQuestVarReq.PARSER, input, extensionRegistry);
        }
        
        public static QuestUpdateQuestVarReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QuestUpdateQuestVarReq.PARSER, input);
        }
        
        public static QuestUpdateQuestVarReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QuestUpdateQuestVarReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return QuestUpdateQuestVarReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final QuestUpdateQuestVarReq prototype) {
            return QuestUpdateQuestVarReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == QuestUpdateQuestVarReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static QuestUpdateQuestVarReq getDefaultInstance() {
            return QuestUpdateQuestVarReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<QuestUpdateQuestVarReq> parser() {
            return QuestUpdateQuestVarReq.PARSER;
        }
        
        @Override
        public Parser<QuestUpdateQuestVarReq> getParserForType() {
            return QuestUpdateQuestVarReq.PARSER;
        }
        
        @Override
        public QuestUpdateQuestVarReq getDefaultInstanceForType() {
            return QuestUpdateQuestVarReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new QuestUpdateQuestVarReq();
            PARSER = new AbstractParser<QuestUpdateQuestVarReq>() {
                @Override
                public QuestUpdateQuestVarReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new QuestUpdateQuestVarReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements QuestUpdateQuestVarReqOrBuilder
        {
            private int bitField0_;
            private int parentQuestId_;
            private List<QuestVarOpOuterClass.QuestVarOp> questVarOpList_;
            private RepeatedFieldBuilderV3<QuestVarOpOuterClass.QuestVarOp, QuestVarOpOuterClass.QuestVarOp.Builder, QuestVarOpOuterClass.QuestVarOpOrBuilder> questVarOpListBuilder_;
            private int questId_;
            private int parentQuestVarSeq_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return QuestUpdateQuestVarReqOuterClass.internal_static_QuestUpdateQuestVarReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return QuestUpdateQuestVarReqOuterClass.internal_static_QuestUpdateQuestVarReq_fieldAccessorTable.ensureFieldAccessorsInitialized(QuestUpdateQuestVarReq.class, Builder.class);
            }
            
            private Builder() {
                this.questVarOpList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.questVarOpList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (QuestUpdateQuestVarReq.alwaysUseFieldBuilders) {
                    this.getQuestVarOpListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.parentQuestId_ = 0;
                if (this.questVarOpListBuilder_ == null) {
                    this.questVarOpList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.questVarOpListBuilder_.clear();
                }
                this.questId_ = 0;
                this.parentQuestVarSeq_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return QuestUpdateQuestVarReqOuterClass.internal_static_QuestUpdateQuestVarReq_descriptor;
            }
            
            @Override
            public QuestUpdateQuestVarReq getDefaultInstanceForType() {
                return QuestUpdateQuestVarReq.getDefaultInstance();
            }
            
            @Override
            public QuestUpdateQuestVarReq build() {
                final QuestUpdateQuestVarReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public QuestUpdateQuestVarReq buildPartial() {
                final QuestUpdateQuestVarReq result = new QuestUpdateQuestVarReq(this);
                final int from_bitField0_ = this.bitField0_;
                result.parentQuestId_ = this.parentQuestId_;
                if (this.questVarOpListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.questVarOpList_ = Collections.unmodifiableList((List<? extends QuestVarOpOuterClass.QuestVarOp>)this.questVarOpList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.questVarOpList_ = this.questVarOpList_;
                }
                else {
                    result.questVarOpList_ = this.questVarOpListBuilder_.build();
                }
                result.questId_ = this.questId_;
                result.parentQuestVarSeq_ = this.parentQuestVarSeq_;
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
                if (other instanceof QuestUpdateQuestVarReq) {
                    return this.mergeFrom((QuestUpdateQuestVarReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final QuestUpdateQuestVarReq other) {
                if (other == QuestUpdateQuestVarReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getParentQuestId() != 0) {
                    this.setParentQuestId(other.getParentQuestId());
                }
                if (this.questVarOpListBuilder_ == null) {
                    if (!other.questVarOpList_.isEmpty()) {
                        if (this.questVarOpList_.isEmpty()) {
                            this.questVarOpList_ = other.questVarOpList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureQuestVarOpListIsMutable();
                            this.questVarOpList_.addAll(other.questVarOpList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.questVarOpList_.isEmpty()) {
                    if (this.questVarOpListBuilder_.isEmpty()) {
                        this.questVarOpListBuilder_.dispose();
                        this.questVarOpListBuilder_ = null;
                        this.questVarOpList_ = other.questVarOpList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.questVarOpListBuilder_ = (QuestUpdateQuestVarReq.alwaysUseFieldBuilders ? this.getQuestVarOpListFieldBuilder() : null);
                    }
                    else {
                        this.questVarOpListBuilder_.addAllMessages(other.questVarOpList_);
                    }
                }
                if (other.getQuestId() != 0) {
                    this.setQuestId(other.getQuestId());
                }
                if (other.getParentQuestVarSeq() != 0) {
                    this.setParentQuestVarSeq(other.getParentQuestVarSeq());
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
                QuestUpdateQuestVarReq parsedMessage = null;
                try {
                    parsedMessage = QuestUpdateQuestVarReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (QuestUpdateQuestVarReq)e.getUnfinishedMessage();
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
            public int getParentQuestId() {
                return this.parentQuestId_;
            }
            
            public Builder setParentQuestId(final int value) {
                this.parentQuestId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearParentQuestId() {
                this.parentQuestId_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureQuestVarOpListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.questVarOpList_ = new ArrayList<QuestVarOpOuterClass.QuestVarOp>(this.questVarOpList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<QuestVarOpOuterClass.QuestVarOp> getQuestVarOpListList() {
                if (this.questVarOpListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends QuestVarOpOuterClass.QuestVarOp>)this.questVarOpList_);
                }
                return this.questVarOpListBuilder_.getMessageList();
            }
            
            @Override
            public int getQuestVarOpListCount() {
                if (this.questVarOpListBuilder_ == null) {
                    return this.questVarOpList_.size();
                }
                return this.questVarOpListBuilder_.getCount();
            }
            
            @Override
            public QuestVarOpOuterClass.QuestVarOp getQuestVarOpList(final int index) {
                if (this.questVarOpListBuilder_ == null) {
                    return this.questVarOpList_.get(index);
                }
                return this.questVarOpListBuilder_.getMessage(index);
            }
            
            public Builder setQuestVarOpList(final int index, final QuestVarOpOuterClass.QuestVarOp value) {
                if (this.questVarOpListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureQuestVarOpListIsMutable();
                    this.questVarOpList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.questVarOpListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setQuestVarOpList(final int index, final QuestVarOpOuterClass.QuestVarOp.Builder builderForValue) {
                if (this.questVarOpListBuilder_ == null) {
                    this.ensureQuestVarOpListIsMutable();
                    this.questVarOpList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.questVarOpListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addQuestVarOpList(final QuestVarOpOuterClass.QuestVarOp value) {
                if (this.questVarOpListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureQuestVarOpListIsMutable();
                    this.questVarOpList_.add(value);
                    this.onChanged();
                }
                else {
                    this.questVarOpListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addQuestVarOpList(final int index, final QuestVarOpOuterClass.QuestVarOp value) {
                if (this.questVarOpListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureQuestVarOpListIsMutable();
                    this.questVarOpList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.questVarOpListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addQuestVarOpList(final QuestVarOpOuterClass.QuestVarOp.Builder builderForValue) {
                if (this.questVarOpListBuilder_ == null) {
                    this.ensureQuestVarOpListIsMutable();
                    this.questVarOpList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.questVarOpListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addQuestVarOpList(final int index, final QuestVarOpOuterClass.QuestVarOp.Builder builderForValue) {
                if (this.questVarOpListBuilder_ == null) {
                    this.ensureQuestVarOpListIsMutable();
                    this.questVarOpList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.questVarOpListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllQuestVarOpList(final Iterable<? extends QuestVarOpOuterClass.QuestVarOp> values) {
                if (this.questVarOpListBuilder_ == null) {
                    this.ensureQuestVarOpListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.questVarOpList_);
                    this.onChanged();
                }
                else {
                    this.questVarOpListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearQuestVarOpList() {
                if (this.questVarOpListBuilder_ == null) {
                    this.questVarOpList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.questVarOpListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeQuestVarOpList(final int index) {
                if (this.questVarOpListBuilder_ == null) {
                    this.ensureQuestVarOpListIsMutable();
                    this.questVarOpList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.questVarOpListBuilder_.remove(index);
                }
                return this;
            }
            
            public QuestVarOpOuterClass.QuestVarOp.Builder getQuestVarOpListBuilder(final int index) {
                return this.getQuestVarOpListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public QuestVarOpOuterClass.QuestVarOpOrBuilder getQuestVarOpListOrBuilder(final int index) {
                if (this.questVarOpListBuilder_ == null) {
                    return this.questVarOpList_.get(index);
                }
                return this.questVarOpListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends QuestVarOpOuterClass.QuestVarOpOrBuilder> getQuestVarOpListOrBuilderList() {
                if (this.questVarOpListBuilder_ != null) {
                    return this.questVarOpListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends QuestVarOpOuterClass.QuestVarOpOrBuilder>)this.questVarOpList_);
            }
            
            public QuestVarOpOuterClass.QuestVarOp.Builder addQuestVarOpListBuilder() {
                return this.getQuestVarOpListFieldBuilder().addBuilder(QuestVarOpOuterClass.QuestVarOp.getDefaultInstance());
            }
            
            public QuestVarOpOuterClass.QuestVarOp.Builder addQuestVarOpListBuilder(final int index) {
                return this.getQuestVarOpListFieldBuilder().addBuilder(index, QuestVarOpOuterClass.QuestVarOp.getDefaultInstance());
            }
            
            public List<QuestVarOpOuterClass.QuestVarOp.Builder> getQuestVarOpListBuilderList() {
                return this.getQuestVarOpListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<QuestVarOpOuterClass.QuestVarOp, QuestVarOpOuterClass.QuestVarOp.Builder, QuestVarOpOuterClass.QuestVarOpOrBuilder> getQuestVarOpListFieldBuilder() {
                if (this.questVarOpListBuilder_ == null) {
                    this.questVarOpListBuilder_ = new RepeatedFieldBuilderV3<QuestVarOpOuterClass.QuestVarOp, QuestVarOpOuterClass.QuestVarOp.Builder, QuestVarOpOuterClass.QuestVarOpOrBuilder>(this.questVarOpList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.questVarOpList_ = null;
                }
                return this.questVarOpListBuilder_;
            }
            
            @Override
            public int getQuestId() {
                return this.questId_;
            }
            
            public Builder setQuestId(final int value) {
                this.questId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearQuestId() {
                this.questId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getParentQuestVarSeq() {
                return this.parentQuestVarSeq_;
            }
            
            public Builder setParentQuestVarSeq(final int value) {
                this.parentQuestVarSeq_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearParentQuestVarSeq() {
                this.parentQuestVarSeq_ = 0;
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
    
    public interface QuestUpdateQuestVarReqOrBuilder extends MessageOrBuilder
    {
        int getParentQuestId();
        
        List<QuestVarOpOuterClass.QuestVarOp> getQuestVarOpListList();
        
        QuestVarOpOuterClass.QuestVarOp getQuestVarOpList(final int p0);
        
        int getQuestVarOpListCount();
        
        List<? extends QuestVarOpOuterClass.QuestVarOpOrBuilder> getQuestVarOpListOrBuilderList();
        
        QuestVarOpOuterClass.QuestVarOpOrBuilder getQuestVarOpListOrBuilder(final int p0);
        
        int getQuestId();
        
        int getParentQuestVarSeq();
    }
}
